#include "C:\Documents and Settings\Propietario\Escritorio\Practica 8\main.h"


void main()
{

   setup_adc_ports(NO_ANALOGS);
   setup_adc(ADC_OFF);
   setup_psp(PSP_DISABLED);
   setup_spi(SPI_SS_DISABLED);
   setup_timer_0(RTCC_INTERNAL|RTCC_DIV_1);
   setup_timer_1(T1_DISABLED);
   setup_timer_2(T2_DISABLED,0,1);
   
  
   while(true)
   {
   OUTPUT_HIGH(PIN_B0);
   OUTPUT_HIGH(PIN_B1);
   DELAY_ms(25);
   OUTPUT_LOW(PIN_B0);
   OUTPUT_LOW(PIN_B1);
   DELAY_ms(100);
   OUTPUT_HIGH(PIN_B0);
   OUTPUT_HIGH(PIN_B1);
   DELAY_ms(25);
   OUTPUT_LOW(PIN_B0);
   OUTPUT_LOW(PIN_B1);
   DELAY_ms(250);
   OUTPUT_HIGH(PIN_B2);
   OUTPUT_HIGH(PIN_B3);
   DELAY_ms(25);
   OUTPUT_LOW(PIN_B2);
   OUTPUT_LOW(PIN_B3);
   DELAY_ms(100);
   OUTPUT_HIGH(PIN_B2);
   OUTPUT_HIGH(PIN_B3);
   DELAY_ms(25);
   OUTPUT_LOW(PIN_B2);
   OUTPUT_LOW(PIN_B3);
  }

   // TODO: USER CODE!!

}
