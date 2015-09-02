<proyecto version ='2' nombre='new_session'>
	<circuito url='' nombre='mux2'/>
	<circuito url='' nombre='mux4'/>
	<circuito url='' nombre='sum1'/>
	<componentes version='1' nombre='new_session' tipo='main'>
		<componente>
			<nombre>Definido</nombre>
			<centro x='170' y='190'/>
			<lado>100</lado>
			<grados>0</grados>
			<nombre_especifico>mux4</nombre_especifico>
			<ancho_dibujo>80</ancho_dibujo>
			<alto_dibujo>40</alto_dibujo>
			<offset_entrada x='-30' y='30'/>
			<offset_entrada x='-10' y='30'/>
			<offset_entrada x='10' y='30'/>
			<offset_entrada x='30' y='30'/>
			<offset_entrada x='50' y='-10'/>
			<offset_entrada x='50' y='10'/>
			<offset_salida x='-30' y='-30'/>
			<mapeo_entrada clave='e0' valor='0'/>
			<mapeo_entrada clave='a1' valor='4'/>
			<mapeo_entrada clave='a0' valor='5'/>
			<mapeo_entrada clave='e3' valor='3'/>
			<mapeo_entrada clave='e2' valor='2'/>
			<mapeo_entrada clave='e1' valor='1'/>
			<mapeo_salida clave='s' valor='0'/>
			<mostrar_patillas/>
		</componente>
		<componente>
			<nombre>Definido</nombre>
			<centro x='300' y='260'/>
			<lado>60</lado>
			<grados>0</grados>
			<nombre_especifico>sum1</nombre_especifico>
			<ancho_dibujo>40</ancho_dibujo>
			<alto_dibujo>20</alto_dibujo>
			<offset_entrada x='-10' y='20'/>
			<offset_entrada x='10' y='20'/>
			<offset_entrada x='30' y='0'/>
			<offset_salida x='-30' y='0'/>
			<offset_salida x='-10' y='-20'/>
			<mapeo_entrada clave='ai' valor='0'/>
			<mapeo_entrada clave='bi' valor='1'/>
			<mapeo_entrada clave='ci-1' valor='2'/>
			<mapeo_salida clave='si' valor='1'/>
			<mapeo_salida clave='ci' valor='0'/>
			<mostrar_patillas/>
		</componente>
		<componente>
			<nombre>Definido</nombre>
			<centro x='350' y='370'/>
			<lado>60</lado>
			<grados>0</grados>
			<nombre_especifico>mux2</nombre_especifico>
			<ancho_dibujo>40</ancho_dibujo>
			<alto_dibujo>20</alto_dibujo>
			<offset_entrada x='-10' y='20'/>
			<offset_entrada x='10' y='20'/>
			<offset_entrada x='30' y='0'/>
			<offset_salida x='-10' y='-20'/>
			<mapeo_entrada clave='a0' valor='2'/>
			<mapeo_entrada clave='e1' valor='1'/>
			<mapeo_entrada clave='e0' valor='0'/>
			<mapeo_salida clave='s' valor='0'/>
			<mostrar_patillas/>
		</componente>
		<componente>
			<nombre>And</nombre>
			<centro x='80' y='330'/>
			<lado>60</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Or</nombre>
			<centro x='150' y='330'/>
			<lado>60</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Xor</nombre>
			<centro x='220' y='330'/>
			<lado>60</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Inversor</nombre>
			<centro x='360' y='430'/>
			<lado>40</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='410' y='170'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>op0</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='410' y='140'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>op1</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='410' y='200'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>Compl-1</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='410' y='220'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>ci-1</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='140' y='100'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>si</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='40' y='260'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>ci</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='60' y='500'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>ai</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='340' y='490'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>bi</etiqueta>
		</componente>
	</componentes>
</proyecto>