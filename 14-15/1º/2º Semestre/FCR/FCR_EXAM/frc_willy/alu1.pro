<proyecto version ='2' nombre='alu1'>
	<circuito url='' nombre='alu1'/>
	<circuito url='' nombre='mux2'/>
	<circuito url='' nombre='mux4'/>
	<circuito url='' nombre='sum1'/>
	<componentes version='1' nombre='alu1' tipo='main'>
		<componente>
			<nombre>Punto</nombre>
			<centro x='510' y='150'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>op1</etiqueta>
			<es_entrada>derecha</es_entrada>
			<num_entrada>2</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='510' y='170'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>op0</etiqueta>
			<es_entrada>derecha</es_entrada>
			<num_entrada>3</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='510' y='210'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>Compl-1</etiqueta>
			<es_entrada>derecha</es_entrada>
			<num_entrada>4</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='510' y='250'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>ci-1</etiqueta>
			<es_entrada>derecha</es_entrada>
			<num_entrada>5</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='190' y='80'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>si</etiqueta>
			<es_salida>arriba</es_salida>
			<num_salida>1</num_salida>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='30' y='250'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>ci</etiqueta>
			<es_salida>izquierda</es_salida>
			<num_salida>0</num_salida>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='100' y='560'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>ai</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>0</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='390' y='580'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>bi</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>1</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='100' y='360'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='120' y='370'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='200' y='360'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='220' y='370'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='310' y='360'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='330' y='370'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='390' y='540'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='360' y='360'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='380' y='370'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Definido</nombre>
			<centro x='220' y='160'/>
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
			<centro x='420' y='250'/>
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
			<nombre>And</nombre>
			<centro x='110' y='300'/>
			<lado>60</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Or</nombre>
			<centro x='210' y='300'/>
			<lado>60</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Xor</nombre>
			<centro x='320' y='300'/>
			<lado>60</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Inversor</nombre>
			<centro x='430' y='510'/>
			<lado>40</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Definido</nombre>
			<centro x='400' y='440'/>
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
		<conexion>
			<origen x='355' y='360' />
			<destino x='315' y='360' />
			<punto x='350' y='360' />
			<punto x='345' y='360' />
			<punto x='340' y='360' />
			<punto x='335' y='360' />
			<punto x='330' y='360' />
			<punto x='325' y='360' />
			<punto x='320' y='360' />
		</conexion>
		<conexion>
			<origen x='375' y='370' />
			<destino x='335' y='370' />
			<punto x='370' y='370' />
			<punto x='365' y='370' />
			<punto x='360' y='370' />
			<punto x='355' y='370' />
			<punto x='350' y='370' />
			<punto x='345' y='370' />
			<punto x='340' y='370' />
		</conexion>
		<conexion>
			<origen x='100' y='365' />
			<destino x='100' y='555' />
			<punto x='100' y='370' />
			<punto x='100' y='375' />
			<punto x='100' y='380' />
			<punto x='100' y='385' />
			<punto x='100' y='390' />
			<punto x='100' y='395' />
			<punto x='100' y='400' />
			<punto x='100' y='405' />
			<punto x='100' y='410' />
			<punto x='100' y='415' />
			<punto x='100' y='420' />
			<punto x='100' y='425' />
			<punto x='100' y='430' />
			<punto x='100' y='435' />
			<punto x='100' y='440' />
			<punto x='100' y='445' />
			<punto x='100' y='450' />
			<punto x='100' y='455' />
			<punto x='100' y='460' />
			<punto x='100' y='465' />
			<punto x='100' y='470' />
			<punto x='100' y='475' />
			<punto x='100' y='480' />
			<punto x='100' y='485' />
			<punto x='100' y='490' />
			<punto x='100' y='495' />
			<punto x='100' y='500' />
			<punto x='100' y='505' />
			<punto x='100' y='510' />
			<punto x='100' y='515' />
			<punto x='100' y='520' />
			<punto x='100' y='525' />
			<punto x='100' y='530' />
			<punto x='100' y='535' />
			<punto x='100' y='540' />
			<punto x='100' y='545' />
			<punto x='100' y='550' />
		</conexion>
		<conexion>
			<origen x='195' y='360' />
			<destino x='105' y='360' />
			<punto x='190' y='360' />
			<punto x='185' y='360' />
			<punto x='180' y='360' />
			<punto x='175' y='360' />
			<punto x='170' y='360' />
			<punto x='165' y='360' />
			<punto x='160' y='360' />
			<punto x='155' y='360' />
			<punto x='150' y='360' />
			<punto x='145' y='360' />
			<punto x='140' y='360' />
			<punto x='135' y='360' />
			<punto x='130' y='360' />
			<punto x='125' y='360' />
			<punto x='120' y='360' />
			<punto x='115' y='360' />
			<punto x='110' y='360' />
		</conexion>
		<conexion>
			<origen x='215' y='370' />
			<destino x='125' y='370' />
			<punto x='210' y='370' />
			<punto x='205' y='370' />
			<punto x='200' y='370' />
			<punto x='195' y='370' />
			<punto x='190' y='370' />
			<punto x='185' y='370' />
			<punto x='180' y='370' />
			<punto x='175' y='370' />
			<punto x='170' y='370' />
			<punto x='165' y='370' />
			<punto x='160' y='370' />
			<punto x='155' y='370' />
			<punto x='150' y='370' />
			<punto x='145' y='370' />
			<punto x='140' y='370' />
			<punto x='135' y='370' />
			<punto x='130' y='370' />
		</conexion>
		<conexion>
			<origen x='305' y='360' />
			<destino x='205' y='360' />
			<punto x='300' y='360' />
			<punto x='295' y='360' />
			<punto x='290' y='360' />
			<punto x='285' y='360' />
			<punto x='280' y='360' />
			<punto x='275' y='360' />
			<punto x='270' y='360' />
			<punto x='265' y='360' />
			<punto x='260' y='360' />
			<punto x='255' y='360' />
			<punto x='250' y='360' />
			<punto x='245' y='360' />
			<punto x='240' y='360' />
			<punto x='235' y='360' />
			<punto x='230' y='360' />
			<punto x='225' y='360' />
			<punto x='220' y='360' />
			<punto x='215' y='360' />
			<punto x='210' y='360' />
		</conexion>
		<conexion>
			<origen x='325' y='370' />
			<destino x='225' y='370' />
			<punto x='320' y='370' />
			<punto x='315' y='370' />
			<punto x='310' y='370' />
			<punto x='305' y='370' />
			<punto x='300' y='370' />
			<punto x='295' y='370' />
			<punto x='290' y='370' />
			<punto x='285' y='370' />
			<punto x='280' y='370' />
			<punto x='275' y='370' />
			<punto x='270' y='370' />
			<punto x='265' y='370' />
			<punto x='260' y='370' />
			<punto x='255' y='370' />
			<punto x='250' y='370' />
			<punto x='245' y='370' />
			<punto x='240' y='370' />
			<punto x='235' y='370' />
			<punto x='230' y='370' />
		</conexion>
		<conexion>
			<origen x='360' y='355' />
			<destino x='410' y='270' />
			<punto x='360' y='350' />
			<punto x='365' y='350' />
			<punto x='370' y='350' />
			<punto x='375' y='350' />
			<punto x='380' y='350' />
			<punto x='385' y='350' />
			<punto x='390' y='350' />
			<punto x='395' y='350' />
			<punto x='400' y='350' />
			<punto x='405' y='350' />
			<punto x='410' y='350' />
			<punto x='410' y='345' />
			<punto x='410' y='340' />
			<punto x='410' y='335' />
			<punto x='410' y='330' />
			<punto x='410' y='325' />
			<punto x='410' y='320' />
			<punto x='410' y='315' />
			<punto x='410' y='310' />
			<punto x='410' y='305' />
			<punto x='410' y='300' />
			<punto x='410' y='295' />
			<punto x='410' y='290' />
			<punto x='410' y='285' />
			<punto x='410' y='280' />
			<punto x='410' y='275' />
		</conexion>
		<conexion>
			<origen x='380' y='365' />
			<destino x='430' y='270' />
			<punto x='380' y='360' />
			<punto x='385' y='360' />
			<punto x='390' y='360' />
			<punto x='395' y='360' />
			<punto x='400' y='360' />
			<punto x='405' y='360' />
			<punto x='410' y='360' />
			<punto x='415' y='360' />
			<punto x='420' y='360' />
			<punto x='425' y='360' />
			<punto x='430' y='360' />
			<punto x='430' y='355' />
			<punto x='430' y='350' />
			<punto x='430' y='345' />
			<punto x='430' y='340' />
			<punto x='430' y='335' />
			<punto x='430' y='330' />
			<punto x='430' y='325' />
			<punto x='430' y='320' />
			<punto x='430' y='315' />
			<punto x='430' y='310' />
			<punto x='430' y='305' />
			<punto x='430' y='300' />
			<punto x='430' y='295' />
			<punto x='430' y='290' />
			<punto x='430' y='285' />
			<punto x='430' y='280' />
			<punto x='430' y='275' />
		</conexion>
		<conexion>
			<origen x='390' y='250' />
			<destino x='35' y='250' />
			<punto x='385' y='250' />
			<punto x='380' y='250' />
			<punto x='375' y='250' />
			<punto x='370' y='250' />
			<punto x='365' y='250' />
			<punto x='360' y='250' />
			<punto x='355' y='250' />
			<punto x='350' y='250' />
			<punto x='345' y='250' />
			<punto x='340' y='250' />
			<punto x='335' y='250' />
			<punto x='330' y='250' />
			<punto x='325' y='250' />
			<punto x='320' y='250' />
			<punto x='315' y='250' />
			<punto x='310' y='250' />
			<punto x='305' y='250' />
			<punto x='300' y='250' />
			<punto x='295' y='250' />
			<punto x='290' y='250' />
			<punto x='285' y='250' />
			<punto x='280' y='250' />
			<punto x='275' y='250' />
			<punto x='270' y='250' />
			<punto x='265' y='250' />
			<punto x='260' y='250' />
			<punto x='255' y='250' />
			<punto x='250' y='250' />
			<punto x='245' y='250' />
			<punto x='240' y='250' />
			<punto x='235' y='250' />
			<punto x='230' y='250' />
			<punto x='225' y='250' />
			<punto x='220' y='250' />
			<punto x='215' y='250' />
			<punto x='210' y='250' />
			<punto x='205' y='250' />
			<punto x='200' y='250' />
			<punto x='195' y='250' />
			<punto x='190' y='250' />
			<punto x='185' y='250' />
			<punto x='180' y='250' />
			<punto x='175' y='250' />
			<punto x='170' y='250' />
			<punto x='165' y='250' />
			<punto x='160' y='250' />
			<punto x='155' y='250' />
			<punto x='150' y='250' />
			<punto x='145' y='250' />
			<punto x='140' y='250' />
			<punto x='135' y='250' />
			<punto x='130' y='250' />
			<punto x='125' y='250' />
			<punto x='120' y='250' />
			<punto x='115' y='250' />
			<punto x='110' y='250' />
			<punto x='105' y='250' />
			<punto x='100' y='250' />
			<punto x='95' y='250' />
			<punto x='90' y='250' />
			<punto x='85' y='250' />
			<punto x='80' y='250' />
			<punto x='75' y='250' />
			<punto x='70' y='250' />
			<punto x='65' y='250' />
			<punto x='60' y='250' />
			<punto x='55' y='250' />
			<punto x='50' y='250' />
			<punto x='45' y='250' />
			<punto x='40' y='250' />
		</conexion>
		<conexion>
			<origen x='310' y='355' />
			<destino x='310' y='330' />
			<punto x='310' y='350' />
			<punto x='310' y='345' />
			<punto x='310' y='340' />
			<punto x='310' y='335' />
		</conexion>
		<conexion>
			<origen x='330' y='365' />
			<destino x='330' y='330' />
			<punto x='330' y='360' />
			<punto x='330' y='355' />
			<punto x='330' y='350' />
			<punto x='330' y='345' />
			<punto x='330' y='340' />
			<punto x='330' y='335' />
		</conexion>
		<conexion>
			<origen x='220' y='365' />
			<destino x='220' y='330' />
			<punto x='220' y='360' />
			<punto x='220' y='355' />
			<punto x='220' y='350' />
			<punto x='220' y='345' />
			<punto x='220' y='340' />
			<punto x='220' y='335' />
		</conexion>
		<conexion>
			<origen x='200' y='355' />
			<destino x='200' y='330' />
			<punto x='200' y='350' />
			<punto x='200' y='345' />
			<punto x='200' y='340' />
			<punto x='200' y='335' />
		</conexion>
		<conexion>
			<origen x='120' y='365' />
			<destino x='120' y='330' />
			<punto x='120' y='360' />
			<punto x='120' y='355' />
			<punto x='120' y='350' />
			<punto x='120' y='345' />
			<punto x='120' y='340' />
			<punto x='120' y='335' />
		</conexion>
		<conexion>
			<origen x='100' y='355' />
			<destino x='100' y='330' />
			<punto x='100' y='350' />
			<punto x='100' y='345' />
			<punto x='100' y='340' />
			<punto x='100' y='335' />
		</conexion>
		<conexion>
			<origen x='110' y='270' />
			<destino x='190' y='190' />
			<punto x='110' y='265' />
			<punto x='115' y='265' />
			<punto x='120' y='265' />
			<punto x='125' y='265' />
			<punto x='130' y='265' />
			<punto x='135' y='265' />
			<punto x='140' y='265' />
			<punto x='145' y='265' />
			<punto x='150' y='265' />
			<punto x='155' y='265' />
			<punto x='160' y='265' />
			<punto x='165' y='265' />
			<punto x='170' y='265' />
			<punto x='175' y='265' />
			<punto x='180' y='265' />
			<punto x='185' y='265' />
			<punto x='190' y='265' />
			<punto x='190' y='260' />
			<punto x='190' y='255' />
			<punto x='190' y='250' />
			<punto x='190' y='245' />
			<punto x='190' y='240' />
			<punto x='190' y='235' />
			<punto x='190' y='230' />
			<punto x='190' y='225' />
			<punto x='190' y='220' />
			<punto x='190' y='215' />
			<punto x='190' y='210' />
			<punto x='190' y='205' />
			<punto x='190' y='200' />
			<punto x='190' y='195' />
		</conexion>
		<conexion>
			<origen x='210' y='270' />
			<destino x='210' y='190' />
			<punto x='210' y='265' />
			<punto x='210' y='260' />
			<punto x='210' y='255' />
			<punto x='210' y='250' />
			<punto x='210' y='245' />
			<punto x='210' y='240' />
			<punto x='210' y='235' />
			<punto x='210' y='230' />
			<punto x='210' y='225' />
			<punto x='210' y='220' />
			<punto x='210' y='215' />
			<punto x='210' y='210' />
			<punto x='210' y='205' />
			<punto x='210' y='200' />
			<punto x='210' y='195' />
		</conexion>
		<conexion>
			<origen x='320' y='270' />
			<destino x='230' y='190' />
			<punto x='320' y='265' />
			<punto x='315' y='265' />
			<punto x='310' y='265' />
			<punto x='305' y='265' />
			<punto x='300' y='265' />
			<punto x='295' y='265' />
			<punto x='290' y='265' />
			<punto x='285' y='265' />
			<punto x='280' y='265' />
			<punto x='275' y='265' />
			<punto x='270' y='265' />
			<punto x='265' y='265' />
			<punto x='260' y='265' />
			<punto x='255' y='265' />
			<punto x='250' y='265' />
			<punto x='245' y='265' />
			<punto x='240' y='265' />
			<punto x='235' y='265' />
			<punto x='230' y='265' />
			<punto x='230' y='260' />
			<punto x='230' y='255' />
			<punto x='230' y='250' />
			<punto x='230' y='245' />
			<punto x='230' y='240' />
			<punto x='230' y='235' />
			<punto x='230' y='230' />
			<punto x='230' y='225' />
			<punto x='230' y='220' />
			<punto x='230' y='215' />
			<punto x='230' y='210' />
			<punto x='230' y='205' />
			<punto x='230' y='200' />
			<punto x='230' y='195' />
		</conexion>
		<conexion>
			<origen x='410' y='230' />
			<destino x='250' y='190' />
			<punto x='410' y='225' />
			<punto x='405' y='225' />
			<punto x='400' y='225' />
			<punto x='395' y='225' />
			<punto x='390' y='225' />
			<punto x='385' y='225' />
			<punto x='380' y='225' />
			<punto x='375' y='225' />
			<punto x='370' y='225' />
			<punto x='365' y='225' />
			<punto x='360' y='225' />
			<punto x='355' y='225' />
			<punto x='350' y='225' />
			<punto x='345' y='225' />
			<punto x='340' y='225' />
			<punto x='335' y='225' />
			<punto x='330' y='225' />
			<punto x='325' y='225' />
			<punto x='320' y='225' />
			<punto x='315' y='225' />
			<punto x='310' y='225' />
			<punto x='305' y='225' />
			<punto x='300' y='225' />
			<punto x='295' y='225' />
			<punto x='290' y='225' />
			<punto x='285' y='225' />
			<punto x='280' y='225' />
			<punto x='275' y='225' />
			<punto x='270' y='225' />
			<punto x='265' y='225' />
			<punto x='260' y='225' />
			<punto x='255' y='225' />
			<punto x='250' y='225' />
			<punto x='250' y='220' />
			<punto x='250' y='215' />
			<punto x='250' y='210' />
			<punto x='250' y='205' />
			<punto x='250' y='200' />
			<punto x='250' y='195' />
		</conexion>
		<conexion>
			<origen x='505' y='250' />
			<destino x='450' y='250' />
			<punto x='500' y='250' />
			<punto x='495' y='250' />
			<punto x='490' y='250' />
			<punto x='485' y='250' />
			<punto x='480' y='250' />
			<punto x='475' y='250' />
			<punto x='470' y='250' />
			<punto x='465' y='250' />
			<punto x='460' y='250' />
			<punto x='455' y='250' />
		</conexion>
		<conexion>
			<origen x='505' y='170' />
			<destino x='270' y='170' />
			<punto x='500' y='170' />
			<punto x='495' y='170' />
			<punto x='490' y='170' />
			<punto x='485' y='170' />
			<punto x='480' y='170' />
			<punto x='475' y='170' />
			<punto x='470' y='170' />
			<punto x='465' y='170' />
			<punto x='460' y='170' />
			<punto x='455' y='170' />
			<punto x='450' y='170' />
			<punto x='445' y='170' />
			<punto x='440' y='170' />
			<punto x='435' y='170' />
			<punto x='430' y='170' />
			<punto x='425' y='170' />
			<punto x='420' y='170' />
			<punto x='415' y='170' />
			<punto x='410' y='170' />
			<punto x='405' y='170' />
			<punto x='400' y='170' />
			<punto x='395' y='170' />
			<punto x='390' y='170' />
			<punto x='385' y='170' />
			<punto x='380' y='170' />
			<punto x='375' y='170' />
			<punto x='370' y='170' />
			<punto x='365' y='170' />
			<punto x='360' y='170' />
			<punto x='355' y='170' />
			<punto x='350' y='170' />
			<punto x='345' y='170' />
			<punto x='340' y='170' />
			<punto x='335' y='170' />
			<punto x='330' y='170' />
			<punto x='325' y='170' />
			<punto x='320' y='170' />
			<punto x='315' y='170' />
			<punto x='310' y='170' />
			<punto x='305' y='170' />
			<punto x='300' y='170' />
			<punto x='295' y='170' />
			<punto x='290' y='170' />
			<punto x='285' y='170' />
			<punto x='280' y='170' />
			<punto x='275' y='170' />
		</conexion>
		<conexion>
			<origen x='505' y='150' />
			<destino x='270' y='150' />
			<punto x='500' y='150' />
			<punto x='495' y='150' />
			<punto x='490' y='150' />
			<punto x='485' y='150' />
			<punto x='480' y='150' />
			<punto x='475' y='150' />
			<punto x='470' y='150' />
			<punto x='465' y='150' />
			<punto x='460' y='150' />
			<punto x='455' y='150' />
			<punto x='450' y='150' />
			<punto x='445' y='150' />
			<punto x='440' y='150' />
			<punto x='435' y='150' />
			<punto x='430' y='150' />
			<punto x='425' y='150' />
			<punto x='420' y='150' />
			<punto x='415' y='150' />
			<punto x='410' y='150' />
			<punto x='405' y='150' />
			<punto x='400' y='150' />
			<punto x='395' y='150' />
			<punto x='390' y='150' />
			<punto x='385' y='150' />
			<punto x='380' y='150' />
			<punto x='375' y='150' />
			<punto x='370' y='150' />
			<punto x='365' y='150' />
			<punto x='360' y='150' />
			<punto x='355' y='150' />
			<punto x='350' y='150' />
			<punto x='345' y='150' />
			<punto x='340' y='150' />
			<punto x='335' y='150' />
			<punto x='330' y='150' />
			<punto x='325' y='150' />
			<punto x='320' y='150' />
			<punto x='315' y='150' />
			<punto x='310' y='150' />
			<punto x='305' y='150' />
			<punto x='300' y='150' />
			<punto x='295' y='150' />
			<punto x='290' y='150' />
			<punto x='285' y='150' />
			<punto x='280' y='150' />
			<punto x='275' y='150' />
		</conexion>
		<conexion>
			<origen x='505' y='210' />
			<destino x='430' y='440' />
			<punto x='500' y='210' />
			<punto x='500' y='215' />
			<punto x='500' y='220' />
			<punto x='500' y='225' />
			<punto x='500' y='230' />
			<punto x='500' y='235' />
			<punto x='500' y='240' />
			<punto x='500' y='245' />
			<punto x='500' y='250' />
			<punto x='500' y='255' />
			<punto x='500' y='260' />
			<punto x='500' y='265' />
			<punto x='500' y='270' />
			<punto x='500' y='275' />
			<punto x='500' y='280' />
			<punto x='500' y='285' />
			<punto x='500' y='290' />
			<punto x='500' y='295' />
			<punto x='500' y='300' />
			<punto x='500' y='305' />
			<punto x='500' y='310' />
			<punto x='500' y='315' />
			<punto x='500' y='320' />
			<punto x='500' y='325' />
			<punto x='500' y='330' />
			<punto x='500' y='335' />
			<punto x='500' y='340' />
			<punto x='500' y='345' />
			<punto x='500' y='350' />
			<punto x='500' y='355' />
			<punto x='500' y='360' />
			<punto x='500' y='365' />
			<punto x='500' y='370' />
			<punto x='500' y='375' />
			<punto x='500' y='380' />
			<punto x='500' y='385' />
			<punto x='500' y='390' />
			<punto x='500' y='395' />
			<punto x='500' y='400' />
			<punto x='500' y='405' />
			<punto x='500' y='410' />
			<punto x='500' y='415' />
			<punto x='500' y='420' />
			<punto x='500' y='425' />
			<punto x='500' y='430' />
			<punto x='500' y='435' />
			<punto x='500' y='440' />
			<punto x='495' y='440' />
			<punto x='490' y='440' />
			<punto x='485' y='440' />
			<punto x='480' y='440' />
			<punto x='475' y='440' />
			<punto x='470' y='440' />
			<punto x='465' y='440' />
			<punto x='460' y='440' />
			<punto x='455' y='440' />
			<punto x='450' y='440' />
			<punto x='445' y='440' />
			<punto x='440' y='440' />
			<punto x='435' y='440' />
		</conexion>
		<conexion>
			<origen x='390' y='420' />
			<destino x='385' y='370' />
			<punto x='390' y='415' />
			<punto x='390' y='410' />
			<punto x='390' y='405' />
			<punto x='390' y='400' />
			<punto x='390' y='395' />
			<punto x='390' y='390' />
			<punto x='390' y='385' />
			<punto x='390' y='380' />
			<punto x='390' y='375' />
			<punto x='390' y='370' />
		</conexion>
		<conexion>
			<origen x='390' y='545' />
			<destino x='390' y='575' />
			<punto x='390' y='550' />
			<punto x='390' y='555' />
			<punto x='390' y='560' />
			<punto x='390' y='565' />
			<punto x='390' y='570' />
		</conexion>
		<conexion>
			<origen x='390' y='535' />
			<destino x='390' y='460' />
			<punto x='390' y='530' />
			<punto x='390' y='525' />
			<punto x='390' y='520' />
			<punto x='390' y='515' />
			<punto x='390' y='510' />
			<punto x='390' y='505' />
			<punto x='390' y='500' />
			<punto x='390' y='495' />
			<punto x='390' y='490' />
			<punto x='390' y='485' />
			<punto x='390' y='480' />
			<punto x='390' y='475' />
			<punto x='390' y='470' />
			<punto x='390' y='465' />
		</conexion>
		<conexion>
			<origen x='395' y='540' />
			<destino x='430' y='530' />
			<punto x='400' y='540' />
			<punto x='400' y='535' />
			<punto x='405' y='535' />
			<punto x='410' y='535' />
			<punto x='415' y='535' />
			<punto x='420' y='535' />
			<punto x='425' y='535' />
			<punto x='430' y='535' />
		</conexion>
		<conexion>
			<origen x='430' y='490' />
			<destino x='410' y='460' />
			<punto x='430' y='485' />
			<punto x='425' y='485' />
			<punto x='420' y='485' />
			<punto x='415' y='485' />
			<punto x='410' y='485' />
			<punto x='410' y='480' />
			<punto x='410' y='475' />
			<punto x='410' y='470' />
			<punto x='410' y='465' />
		</conexion>
		<conexion>
			<origen x='190' y='130' />
			<destino x='190' y='85' />
			<punto x='190' y='125' />
			<punto x='190' y='120' />
			<punto x='190' y='115' />
			<punto x='190' y='110' />
			<punto x='190' y='105' />
			<punto x='190' y='100' />
			<punto x='190' y='95' />
			<punto x='190' y='90' />
		</conexion>
	</componentes>
</proyecto>