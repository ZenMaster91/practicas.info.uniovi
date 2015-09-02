#include "C:\Documents and Settings\Propietario\Escritorio\main.h"
// **************************************************************************************
//-- Definiciones para los motores. Estos valores definen los movimientos del robot

#define   AVANZA     0x1C  //-- Binario: 0001 1100
#define   ATRAS      0x16  //-- Binario: 0001 0110
#define   IZQUIERDA  0x1E  //-- Binario: 0001 1110
#define   DERECHA    0x14  //-- Binario: 0001 0100
#define   STOP       0x00  //-- Binario: 0000 0000

#byte PORTB = 0x06               // localizaci?n en la memoria de datos del puerto B
#byte TRISB = 0x86               // localizaci?n en la memoria de datos de   TRISB


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

//-- Variables defined by Guillermo & Alejandro--//
int direc;

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
        
        if ((IZQUIERDO==NEGRO) && (DERECHO==NEGRO)){ SKYBOT = AVANZA;}
        
        else if ((IZQUIERDO == BLANCO) && (DERECHO == BLANCO)){
            SKYBOT = AVANZA;
            delay_ms(250);
            if ((IZQUIERDO == BLANCO) && (DERECHO == BLANCO)){
                SKYBOT = ATRAS;
                delay_ms(250);
                if(direc < 0)
                {
                    SKYBOT = IZQUIERDA;
                    delay_ms(100);
                }
                if(direc > 0)
                {
                    SKYBOT = DERECHA;
                    delay_ms(100);
                }
                SKYBOT = STOP;
            }
        }
        else if ((IZQUIERDO == NEGRO)&&(DERECHO == BLANCO))
        {
            //-- In that case the robot will go a bit fordward and then will check if it is in the cuve.
            SKYBOT = AVANZA;
            delay_ms(10);
            if ((IZQUIERDO == BLANCO) && (DERECHO == BLANCO)){
                SKYBOT = ATRAS;
                delay_ms(250);
                if(direc < 0)
                {
                    SKYBOT = IZQUIERDA;
                    delay_ms(100);
                }
                if(direc > 0)
                {
                    SKYBOT = DERECHA;
                    delay_ms(100);
                }
                SKYBOT = STOP;
            
            }
            
            //-- Original Code.
            direc = direc - 1;
            SKYBOT = IZQUIERDA;
            delay_ms(100);
        }
        else if ((IZQUIERDO == BLANCO)&&(DERECHO == NEGRO))
        {
            direc = direc + 1;
            SKYBOT = DERECHA;
            delay_ms(100);
        }
    }
}
