#include "C:\Documents and Settings\Propietario\Escritorio\Practica 10\practica10.h"

#include <LCD_M.C>

   unsigned int val;
   float temp;
   unsigned int limit = 25;

void main()
{

   setup_adc_ports(AN0);
   setup_adc(ADC_CLOCK_INTERNAL);
   setup_psp(PSP_DISABLED);
   setup_spi(SPI_SS_DISABLED);
   setup_timer_0(RTCC_INTERNAL|RTCC_DIV_1);
   setup_timer_1(T1_DISABLED);
   setup_timer_2(T2_DISABLED,0,1);
   lcd_init();

   // TODO: USER CODE!!

   
   set_adc_channel(0);
   delay_ms(10);
   while(true) {
      val = read_adc(); // Lectura del adc (entre 0-255)
      temp = ((float) val*5.0/255.0); // Conversion a tension
      temp = 10.0*temp; // Conversion a temperatura (10mv -> 1ºC)
      if(temp>limit)
		output_HIGH(PIN_B0);
	  else
		output_LOW(PIN_B0);
   	  printf(lcd_putc,"\fTemp:%3.1f",temp);
	  printf("\fTemp:%3.1f",temp);
      delay_ms(100);
   }
}
