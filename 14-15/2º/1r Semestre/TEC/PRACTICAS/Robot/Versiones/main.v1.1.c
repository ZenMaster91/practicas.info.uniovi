// **************************************************************************************
//-- Definiciones para los motores. Estos valores definen los movimientos del robot

#define   AVANZA     0x1C  //-- Binario: 0001 1100
#define   ATRAS      0x16  //-- Binario: 0001 0110
#define   IZQUIERDA  0x1E  //-- Binario: 0001 1110
#define   DERECHA    0x14  //-- Binario: 0001 0100
#define   STOP       0x00  //-- Binario: 0000 0000

#byte PORTB = 0x06   
#byte TRISB = 0x86    


//-- Controlaremos el Skybot usando la constante SKYBOT

#define SKYBOT PORTB

//-- Valor para configurar el puerto B para trabajar con el Skybot:
//-- Bits RB6 y RB7  entradas de los sensores detecci?n B/W 

//-- Bits RB1, RB2, RB3 y RB4  salidas de control de los motores
// RB2 (motor 1 ON/OFF)  y RB4 (motor 2 ON/OFF)
// RB1 (motor 1 direcci?n)  (RB1=0 adelante, RB1=1 atras)
// RB3 (motor 2 direcci?n)  (RB3=1 adelante, RB1=0 atras)


#define CONF_SKYBOT 0xE1      //-- Binario: 1110 0001    Configuracion E o S de los bits del puerto B

//-- Colocacion de los sensores

#bit   SENSOR3 = 0x06.6       // RB6       sensor derecho
#bit   SENSOR4 = 0x06.7       // RB7       sensor izquierdo


//-- Modificar esto para indicar la colocacion de los sensores
#define IZQUIERDO  SENSOR4
#define DERECHO    SENSOR3

//-- Colores leidos por los sensores
#define NEGRO  1
#define BLANCO 0


// ***************************************************************************************


void configurar_skybot()
{
  TRISB=CONF_SKYBOT;
}




void main()
{

   setup_adc_ports(NO_ANALOGS);
   setup_adc(ADC_OFF);
   setup_spi(FALSE);
   setup_timer_0(RTCC_INTERNAL|RTCC_DIV_1);
   setup_timer_1(T1_DISABLED);
   setup_timer_2(T2_DISABLED,0,1);

   configurar_skybot();

  
 
while (1){

  if ((IZQUIERDO==NEGRO) && (DERECHO==NEGRO)) 
      SKYBOT = AVANZA;
   else if ((IZQUIERDO==BLANCO) && (DERECHO==BLANCO)) 
   {
		SKYBOT = AVANZA;
		delay_ms(215);
	int i;
      for(i=0;i<10;i++)
      {
         SKYBOT = DERECHA;
         delay_ms(150);
         if((IZQUIERDO==NEGRO) || (DERECHO==NEGRO))
            break;
      }
      
      for(i=0;i<20;i++)
      {
         SKYBOT = IZQUIERDA;
         delay_ms(150);
         if((IZQUIERDO==NEGRO) || (DERECHO==NEGRO))
            break;
      }
      
   }
   else if ((IZQUIERDO==BLANCO) && (DERECHO==NEGRO)) {
      SKYBOT = DERECHA;
      
   }
   else if ((IZQUIERDO==NEGRO) && (DERECHO==BLANCO)) {
      SKYBOT = IZQUIERDA;   }  
}
}

