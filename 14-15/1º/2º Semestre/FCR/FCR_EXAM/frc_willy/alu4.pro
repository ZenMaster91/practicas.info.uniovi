<proyecto version ='2' nombre='alu4'>
	<circuito url='' nombre='alu1'/>
	<circuito url='' nombre='alu4'/>
	<circuito url='' nombre='alu4-nf'/>
	<circuito url='' nombre='gen-ov-s'/>
	<circuito url='' nombre='mux2'/>
	<circuito url='' nombre='mux4'/>
	<circuito url='' nombre='nor4'/>
	<circuito url='' nombre='sum1'/>
	<componentes version='1' nombre='alu4' tipo='main'>
		<componente>
			<nombre>Definido</nombre>
			<centro x='560' y='560'/>
			<lado>80</lado>
			<grados>0</grados>
			<nombre_especifico>gen-ov-s</nombre_especifico>
			<ancho_dibujo>60</ancho_dibujo>
			<alto_dibujo>20</alto_dibujo>
			<offset_entrada x='-20' y='20'/>
			<offset_entrada x='0' y='20'/>
			<offset_entrada x='20' y='20'/>
			<offset_salida x='40' y='0'/>
			<mapeo_entrada clave='an-1' valor='0'/>
			<mapeo_entrada clave='sn-1' valor='2'/>
			<mapeo_entrada clave='bn-1' valor='1'/>
			<mapeo_salida clave='ov' valor='0'/>
			<mostrar_patillas/>
		</componente>
		<componente>
			<nombre>Definido</nombre>
			<centro x='420' y='290'/>
			<lado>100</lado>
			<grados>0</grados>
			<nombre_especifico>nor4</nombre_especifico>
			<ancho_dibujo>40</ancho_dibujo>
			<alto_dibujo>80</alto_dibujo>
			<offset_entrada x='-30' y='-30'/>
			<offset_entrada x='-30' y='-10'/>
			<offset_entrada x='-30' y='10'/>
			<offset_entrada x='-30' y='30'/>
			<offset_salida x='30' y='-30'/>
			<mapeo_entrada clave='e3' valor='3'/>
			<mapeo_entrada clave='e2' valor='2'/>
			<mapeo_entrada clave='e1' valor='1'/>
			<mapeo_entrada clave='e0' valor='0'/>
			<mapeo_salida clave='s' valor='0'/>
			<mostrar_patillas/>
		</componente>
		<componente>
			<nombre>Definido</nombre>
			<centro x='360' y='400'/>
			<lado>180</lado>
			<grados>0</grados>
			<nombre_especifico>alu4-nf</nombre_especifico>
			<ancho_dibujo>160</ancho_dibujo>
			<alto_dibujo>80</alto_dibujo>
			<offset_entrada x='-90' y='-30'/>
			<offset_entrada x='-90' y='-10'/>
			<offset_entrada x='-90' y='10'/>
			<offset_entrada x='-90' y='30'/>
			<offset_entrada x='-70' y='50'/>
			<offset_entrada x='-50' y='50'/>
			<offset_entrada x='-30' y='50'/>
			<offset_entrada x='-10' y='50'/>
			<offset_entrada x='10' y='50'/>
			<offset_entrada x='30' y='50'/>
			<offset_entrada x='50' y='50'/>
			<offset_entrada x='70' y='50'/>
			<offset_salida x='-70' y='-50'/>
			<offset_salida x='-50' y='-50'/>
			<offset_salida x='-30' y='-50'/>
			<offset_salida x='-10' y='-50'/>
			<offset_salida x='90' y='-30'/>
			<mapeo_entrada clave='Comp-1' valor='2'/>
			<mapeo_entrada clave='b3' valor='8'/>
			<mapeo_entrada clave='b2' valor='9'/>
			<mapeo_entrada clave='b1' valor='10'/>
			<mapeo_entrada clave='b0' valor='11'/>
			<mapeo_entrada clave='a3' valor='4'/>
			<mapeo_entrada clave='a2' valor='5'/>
			<mapeo_entrada clave='cin' valor='3'/>
			<mapeo_entrada clave='a1' valor='6'/>
			<mapeo_entrada clave='op1' valor='0'/>
			<mapeo_entrada clave='a0' valor='7'/>
			<mapeo_entrada clave='op0' valor='1'/>
			<mapeo_salida clave='s3' valor='0'/>
			<mapeo_salida clave='s2' valor='1'/>
			<mapeo_salida clave='cout' valor='4'/>
			<mapeo_salida clave='s1' valor='2'/>
			<mapeo_salida clave='s0' valor='3'/>
			<mostrar_patillas/>
		</componente>
		<componente>
			<nombre>Xor</nombre>
			<centro x='440' y='640'/>
			<lado>60</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Xor</nombre>
			<centro x='530' y='380'/>
			<lado>60</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='290' y='480'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>a3</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='310' y='480'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>a2</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>5</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='330' y='480'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>a1</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>6</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='350' y='480'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>a0</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>7</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='370' y='480'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>b3</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='390' y='480'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>b2</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>9</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='410' y='480'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>b1</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>10</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='430' y='480'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>b0</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>11</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='640' y='260'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>ZF</etiqueta>
			<es_salida>derecha</es_salida>
			<num_salida>4</num_salida>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='340' y='260'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='240' y='250'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='240' y='700'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='580' y='700'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='560' y='620'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='220' y='410'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>Comp-1</etiqueta>
			<es_entrada>izquierda</es_entrada>
			<num_entrada>2</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='220' y='390'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>op0</etiqueta>
			<es_entrada>izquierda</es_entrada>
			<num_entrada>1</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='220' y='370'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>op1</etiqueta>
			<es_entrada>izquierda</es_entrada>
			<num_entrada>0</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='220' y='430'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>cin</etiqueta>
			<es_entrada>izquierda</es_entrada>
			<num_entrada>3</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='250' y='410'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='250' y='530'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='470' y='530'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='370' y='620'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='640' y='560'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>OF</etiqueta>
			<es_salida>derecha</es_salida>
			<num_salida>6</num_salida>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='640' y='380'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>CF</etiqueta>
			<es_salida>derecha</es_salida>
			<num_salida>5</num_salida>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='640' y='700'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>SF</etiqueta>
			<es_salida>derecha</es_salida>
			<num_salida>7</num_salida>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='350' y='320'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='330' y='300'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='310' y='280'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='290' y='260'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='290' y='210'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>s3</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='310' y='210'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>s2</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='330' y='210'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>s1</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='350' y='210'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>s0</etiqueta>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='370' y='510'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='290' y='510'/>
			<lado>10</lado>
			<grados>0</grados>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='310' y='510'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>a3</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>4</num_entrada>
		</componente>
		<componente>
			<nombre>Punto</nombre>
			<centro x='390' y='510'/>
			<lado>10</lado>
			<grados>0</grados>
			<etiqueta>b3</etiqueta>
			<es_entrada>abajo</es_entrada>
			<num_entrada>8</num_entrada>
		</componente>
		<componente>
			<nombre>Bombilla</nombre>
			<centro x='230' y='160'/>
			<lado>40</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Bombilla</nombre>
			<centro x='290' y='120'/>
			<lado>40</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Bombilla</nombre>
			<centro x='350' y='120'/>
			<lado>40</lado>
			<grados>270</grados>
		</componente>
		<componente>
			<nombre>Bombilla</nombre>
			<centro x='410' y='160'/>
			<lado>40</lado>
			<grados>270</grados>
		</componente>
		<conexion>
			<origen x='290' y='475' />
			<destino x='290' y='450' />
			<punto x='290' y='470' />
			<punto x='290' y='465' />
			<punto x='290' y='460' />
			<punto x='290' y='455' />
		</conexion>
		<conexion>
			<origen x='310' y='475' />
			<destino x='310' y='450' />
			<punto x='310' y='470' />
			<punto x='310' y='465' />
			<punto x='310' y='460' />
			<punto x='310' y='455' />
		</conexion>
		<conexion>
			<origen x='330' y='475' />
			<destino x='330' y='450' />
			<punto x='330' y='470' />
			<punto x='330' y='465' />
			<punto x='330' y='460' />
			<punto x='330' y='455' />
		</conexion>
		<conexion>
			<origen x='350' y='475' />
			<destino x='350' y='450' />
			<punto x='350' y='470' />
			<punto x='350' y='465' />
			<punto x='350' y='460' />
			<punto x='350' y='455' />
		</conexion>
		<conexion>
			<origen x='390' y='475' />
			<destino x='390' y='450' />
			<punto x='390' y='470' />
			<punto x='390' y='465' />
			<punto x='390' y='460' />
			<punto x='390' y='455' />
		</conexion>
		<conexion>
			<origen x='410' y='475' />
			<destino x='410' y='450' />
			<punto x='410' y='470' />
			<punto x='410' y='465' />
			<punto x='410' y='460' />
			<punto x='410' y='455' />
		</conexion>
		<conexion>
			<origen x='430' y='475' />
			<destino x='430' y='450' />
			<punto x='430' y='470' />
			<punto x='430' y='465' />
			<punto x='430' y='460' />
			<punto x='430' y='455' />
		</conexion>
		<conexion>
			<origen x='345' y='260' />
			<destino x='390' y='260' />
			<punto x='350' y='260' />
			<punto x='355' y='260' />
			<punto x='360' y='260' />
			<punto x='365' y='260' />
			<punto x='370' y='260' />
			<punto x='375' y='260' />
			<punto x='380' y='260' />
			<punto x='385' y='260' />
		</conexion>
		<conexion>
			<origen x='340' y='255' />
			<destino x='245' y='250' />
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
		</conexion>
		<conexion>
			<origen x='560' y='615' />
			<destino x='560' y='580' />
			<punto x='560' y='610' />
			<punto x='560' y='605' />
			<punto x='560' y='600' />
			<punto x='560' y='595' />
			<punto x='560' y='590' />
			<punto x='560' y='585' />
		</conexion>
		<conexion>
			<origen x='450' y='370' />
			<destino x='500' y='370' />
			<punto x='455' y='370' />
			<punto x='460' y='370' />
			<punto x='465' y='370' />
			<punto x='470' y='370' />
			<punto x='475' y='370' />
			<punto x='480' y='370' />
			<punto x='485' y='370' />
			<punto x='490' y='370' />
			<punto x='495' y='370' />
		</conexion>
		<conexion>
			<origen x='225' y='370' />
			<destino x='270' y='370' />
			<punto x='230' y='370' />
			<punto x='235' y='370' />
			<punto x='240' y='370' />
			<punto x='245' y='370' />
			<punto x='250' y='370' />
			<punto x='255' y='370' />
			<punto x='260' y='370' />
			<punto x='265' y='370' />
		</conexion>
		<conexion>
			<origen x='225' y='390' />
			<destino x='270' y='390' />
			<punto x='230' y='390' />
			<punto x='235' y='390' />
			<punto x='240' y='390' />
			<punto x='245' y='390' />
			<punto x='250' y='390' />
			<punto x='255' y='390' />
			<punto x='260' y='390' />
			<punto x='265' y='390' />
		</conexion>
		<conexion>
			<origen x='225' y='430' />
			<destino x='270' y='430' />
			<punto x='230' y='430' />
			<punto x='235' y='430' />
			<punto x='240' y='430' />
			<punto x='245' y='430' />
			<punto x='250' y='430' />
			<punto x='255' y='430' />
			<punto x='260' y='430' />
			<punto x='265' y='430' />
		</conexion>
		<conexion>
			<origen x='225' y='410' />
			<destino x='245' y='410' />
			<punto x='230' y='410' />
			<punto x='235' y='410' />
			<punto x='240' y='410' />
		</conexion>
		<conexion>
			<origen x='255' y='410' />
			<destino x='270' y='410' />
			<punto x='260' y='410' />
			<punto x='265' y='410' />
		</conexion>
		<conexion>
			<origen x='475' y='530' />
			<destino x='500' y='390' />
			<punto x='480' y='530' />
			<punto x='480' y='525' />
			<punto x='480' y='520' />
			<punto x='480' y='515' />
			<punto x='480' y='510' />
			<punto x='480' y='505' />
			<punto x='480' y='500' />
			<punto x='480' y='495' />
			<punto x='480' y='490' />
			<punto x='480' y='485' />
			<punto x='480' y='480' />
			<punto x='480' y='475' />
			<punto x='480' y='470' />
			<punto x='480' y='465' />
			<punto x='480' y='460' />
			<punto x='480' y='455' />
			<punto x='480' y='450' />
			<punto x='480' y='445' />
			<punto x='480' y='440' />
			<punto x='480' y='435' />
			<punto x='480' y='430' />
			<punto x='480' y='425' />
			<punto x='480' y='420' />
			<punto x='480' y='415' />
			<punto x='480' y='410' />
			<punto x='480' y='405' />
			<punto x='480' y='400' />
			<punto x='480' y='395' />
			<punto x='480' y='390' />
			<punto x='485' y='390' />
			<punto x='490' y='390' />
			<punto x='495' y='390' />
		</conexion>
		<conexion>
			<origen x='250' y='525' />
			<destino x='250' y='415' />
			<punto x='250' y='520' />
			<punto x='250' y='515' />
			<punto x='250' y='510' />
			<punto x='250' y='505' />
			<punto x='250' y='500' />
			<punto x='250' y='495' />
			<punto x='250' y='490' />
			<punto x='250' y='485' />
			<punto x='250' y='480' />
			<punto x='250' y='475' />
			<punto x='250' y='470' />
			<punto x='250' y='465' />
			<punto x='250' y='460' />
			<punto x='250' y='455' />
			<punto x='250' y='450' />
			<punto x='250' y='445' />
			<punto x='250' y='440' />
			<punto x='250' y='435' />
			<punto x='250' y='430' />
			<punto x='250' y='425' />
			<punto x='250' y='420' />
		</conexion>
		<conexion>
			<origen x='465' y='530' />
			<destino x='255' y='530' />
			<punto x='460' y='530' />
			<punto x='455' y='530' />
			<punto x='450' y='530' />
			<punto x='445' y='530' />
			<punto x='440' y='530' />
			<punto x='435' y='530' />
			<punto x='430' y='530' />
			<punto x='425' y='530' />
			<punto x='420' y='530' />
			<punto x='415' y='530' />
			<punto x='410' y='530' />
			<punto x='405' y='530' />
			<punto x='400' y='530' />
			<punto x='395' y='530' />
			<punto x='390' y='530' />
			<punto x='385' y='530' />
			<punto x='380' y='530' />
			<punto x='375' y='530' />
			<punto x='370' y='530' />
			<punto x='365' y='530' />
			<punto x='360' y='530' />
			<punto x='355' y='530' />
			<punto x='350' y='530' />
			<punto x='345' y='530' />
			<punto x='340' y='530' />
			<punto x='335' y='530' />
			<punto x='330' y='530' />
			<punto x='325' y='530' />
			<punto x='320' y='530' />
			<punto x='315' y='530' />
			<punto x='310' y='530' />
			<punto x='305' y='530' />
			<punto x='300' y='530' />
			<punto x='295' y='530' />
			<punto x='290' y='530' />
			<punto x='285' y='530' />
			<punto x='280' y='530' />
			<punto x='275' y='530' />
			<punto x='270' y='530' />
			<punto x='265' y='530' />
			<punto x='260' y='530' />
		</conexion>
		<conexion>
			<origen x='240' y='255' />
			<destino x='240' y='695' />
			<punto x='240' y='260' />
			<punto x='240' y='265' />
			<punto x='240' y='270' />
			<punto x='240' y='275' />
			<punto x='240' y='280' />
			<punto x='240' y='285' />
			<punto x='240' y='290' />
			<punto x='240' y='295' />
			<punto x='240' y='300' />
			<punto x='240' y='305' />
			<punto x='240' y='310' />
			<punto x='240' y='315' />
			<punto x='240' y='320' />
			<punto x='240' y='325' />
			<punto x='240' y='330' />
			<punto x='240' y='335' />
			<punto x='240' y='340' />
			<punto x='240' y='345' />
			<punto x='240' y='350' />
			<punto x='240' y='355' />
			<punto x='240' y='360' />
			<punto x='240' y='365' />
			<punto x='240' y='370' />
			<punto x='240' y='375' />
			<punto x='240' y='380' />
			<punto x='240' y='385' />
			<punto x='240' y='390' />
			<punto x='240' y='395' />
			<punto x='240' y='400' />
			<punto x='240' y='405' />
			<punto x='240' y='410' />
			<punto x='240' y='415' />
			<punto x='240' y='420' />
			<punto x='240' y='425' />
			<punto x='240' y='430' />
			<punto x='240' y='435' />
			<punto x='240' y='440' />
			<punto x='240' y='445' />
			<punto x='240' y='450' />
			<punto x='240' y='455' />
			<punto x='240' y='460' />
			<punto x='240' y='465' />
			<punto x='240' y='470' />
			<punto x='240' y='475' />
			<punto x='240' y='480' />
			<punto x='240' y='485' />
			<punto x='240' y='490' />
			<punto x='240' y='495' />
			<punto x='240' y='500' />
			<punto x='240' y='505' />
			<punto x='240' y='510' />
			<punto x='240' y='515' />
			<punto x='240' y='520' />
			<punto x='240' y='525' />
			<punto x='240' y='530' />
			<punto x='240' y='535' />
			<punto x='240' y='540' />
			<punto x='240' y='545' />
			<punto x='240' y='550' />
			<punto x='240' y='555' />
			<punto x='240' y='560' />
			<punto x='240' y='565' />
			<punto x='240' y='570' />
			<punto x='240' y='575' />
			<punto x='240' y='580' />
			<punto x='240' y='585' />
			<punto x='240' y='590' />
			<punto x='240' y='595' />
			<punto x='240' y='600' />
			<punto x='240' y='605' />
			<punto x='240' y='610' />
			<punto x='240' y='615' />
			<punto x='240' y='620' />
			<punto x='240' y='625' />
			<punto x='240' y='630' />
			<punto x='240' y='635' />
			<punto x='240' y='640' />
			<punto x='240' y='645' />
			<punto x='240' y='650' />
			<punto x='240' y='655' />
			<punto x='240' y='660' />
			<punto x='240' y='665' />
			<punto x='240' y='670' />
			<punto x='240' y='675' />
			<punto x='240' y='680' />
			<punto x='240' y='685' />
			<punto x='240' y='690' />
		</conexion>
		<conexion>
			<origen x='245' y='700' />
			<destino x='575' y='700' />
			<punto x='250' y='700' />
			<punto x='255' y='700' />
			<punto x='260' y='700' />
			<punto x='265' y='700' />
			<punto x='270' y='700' />
			<punto x='275' y='700' />
			<punto x='280' y='700' />
			<punto x='285' y='700' />
			<punto x='290' y='700' />
			<punto x='295' y='700' />
			<punto x='300' y='700' />
			<punto x='305' y='700' />
			<punto x='310' y='700' />
			<punto x='315' y='700' />
			<punto x='320' y='700' />
			<punto x='325' y='700' />
			<punto x='330' y='700' />
			<punto x='335' y='700' />
			<punto x='340' y='700' />
			<punto x='345' y='700' />
			<punto x='350' y='700' />
			<punto x='355' y='700' />
			<punto x='360' y='700' />
			<punto x='365' y='700' />
			<punto x='370' y='700' />
			<punto x='375' y='700' />
			<punto x='380' y='700' />
			<punto x='385' y='700' />
			<punto x='390' y='700' />
			<punto x='395' y='700' />
			<punto x='400' y='700' />
			<punto x='405' y='700' />
			<punto x='410' y='700' />
			<punto x='415' y='700' />
			<punto x='420' y='700' />
			<punto x='425' y='700' />
			<punto x='430' y='700' />
			<punto x='435' y='700' />
			<punto x='440' y='700' />
			<punto x='445' y='700' />
			<punto x='450' y='700' />
			<punto x='455' y='700' />
			<punto x='460' y='700' />
			<punto x='465' y='700' />
			<punto x='470' y='700' />
			<punto x='475' y='700' />
			<punto x='480' y='700' />
			<punto x='485' y='700' />
			<punto x='490' y='700' />
			<punto x='495' y='700' />
			<punto x='500' y='700' />
			<punto x='505' y='700' />
			<punto x='510' y='700' />
			<punto x='515' y='700' />
			<punto x='520' y='700' />
			<punto x='525' y='700' />
			<punto x='530' y='700' />
			<punto x='535' y='700' />
			<punto x='540' y='700' />
			<punto x='545' y='700' />
			<punto x='550' y='700' />
			<punto x='555' y='700' />
			<punto x='560' y='700' />
			<punto x='565' y='700' />
			<punto x='570' y='700' />
		</conexion>
		<conexion>
			<origen x='580' y='695' />
			<destino x='580' y='580' />
			<punto x='580' y='690' />
			<punto x='580' y='685' />
			<punto x='580' y='680' />
			<punto x='580' y='675' />
			<punto x='580' y='670' />
			<punto x='580' y='665' />
			<punto x='580' y='660' />
			<punto x='580' y='655' />
			<punto x='580' y='650' />
			<punto x='580' y='645' />
			<punto x='580' y='640' />
			<punto x='580' y='635' />
			<punto x='580' y='630' />
			<punto x='580' y='625' />
			<punto x='580' y='620' />
			<punto x='580' y='615' />
			<punto x='580' y='610' />
			<punto x='580' y='605' />
			<punto x='580' y='600' />
			<punto x='580' y='595' />
			<punto x='580' y='590' />
			<punto x='580' y='585' />
		</conexion>
		<conexion>
			<origen x='370' y='475' />
			<destino x='370' y='450' />
			<punto x='370' y='470' />
			<punto x='370' y='465' />
			<punto x='370' y='460' />
			<punto x='370' y='455' />
		</conexion>
		<conexion>
			<origen x='250' y='535' />
			<destino x='410' y='650' />
			<punto x='250' y='540' />
			<punto x='250' y='545' />
			<punto x='250' y='550' />
			<punto x='250' y='555' />
			<punto x='250' y='560' />
			<punto x='250' y='565' />
			<punto x='250' y='570' />
			<punto x='250' y='575' />
			<punto x='250' y='580' />
			<punto x='250' y='585' />
			<punto x='250' y='590' />
			<punto x='250' y='595' />
			<punto x='250' y='600' />
			<punto x='250' y='605' />
			<punto x='250' y='610' />
			<punto x='250' y='615' />
			<punto x='250' y='620' />
			<punto x='250' y='625' />
			<punto x='250' y='630' />
			<punto x='250' y='635' />
			<punto x='250' y='640' />
			<punto x='250' y='645' />
			<punto x='250' y='650' />
			<punto x='255' y='650' />
			<punto x='260' y='650' />
			<punto x='265' y='650' />
			<punto x='270' y='650' />
			<punto x='275' y='650' />
			<punto x='280' y='650' />
			<punto x='285' y='650' />
			<punto x='290' y='650' />
			<punto x='295' y='650' />
			<punto x='300' y='650' />
			<punto x='305' y='650' />
			<punto x='310' y='650' />
			<punto x='315' y='650' />
			<punto x='320' y='650' />
			<punto x='325' y='650' />
			<punto x='330' y='650' />
			<punto x='335' y='650' />
			<punto x='340' y='650' />
			<punto x='345' y='650' />
			<punto x='350' y='650' />
			<punto x='355' y='650' />
			<punto x='360' y='650' />
			<punto x='365' y='650' />
			<punto x='370' y='650' />
			<punto x='375' y='650' />
			<punto x='380' y='650' />
			<punto x='385' y='650' />
			<punto x='390' y='650' />
			<punto x='395' y='650' />
			<punto x='400' y='650' />
			<punto x='405' y='650' />
		</conexion>
		<conexion>
			<origen x='370' y='625' />
			<destino x='410' y='630' />
			<punto x='370' y='630' />
			<punto x='375' y='630' />
			<punto x='380' y='630' />
			<punto x='385' y='630' />
			<punto x='390' y='630' />
			<punto x='395' y='630' />
			<punto x='400' y='630' />
			<punto x='405' y='630' />
		</conexion>
		<conexion>
			<origen x='470' y='640' />
			<destino x='560' y='625' />
			<punto x='475' y='640' />
			<punto x='480' y='640' />
			<punto x='485' y='640' />
			<punto x='490' y='640' />
			<punto x='495' y='640' />
			<punto x='500' y='640' />
			<punto x='505' y='640' />
			<punto x='510' y='640' />
			<punto x='515' y='640' />
			<punto x='520' y='640' />
			<punto x='525' y='640' />
			<punto x='530' y='640' />
			<punto x='535' y='640' />
			<punto x='540' y='640' />
			<punto x='545' y='640' />
			<punto x='550' y='640' />
			<punto x='555' y='640' />
			<punto x='560' y='640' />
			<punto x='560' y='635' />
			<punto x='560' y='630' />
		</conexion>
		<conexion>
			<origen x='450' y='260' />
			<destino x='635' y='260' />
			<punto x='455' y='260' />
			<punto x='460' y='260' />
			<punto x='465' y='260' />
			<punto x='470' y='260' />
			<punto x='475' y='260' />
			<punto x='480' y='260' />
			<punto x='485' y='260' />
			<punto x='490' y='260' />
			<punto x='495' y='260' />
			<punto x='500' y='260' />
			<punto x='505' y='260' />
			<punto x='510' y='260' />
			<punto x='515' y='260' />
			<punto x='520' y='260' />
			<punto x='525' y='260' />
			<punto x='530' y='260' />
			<punto x='535' y='260' />
			<punto x='540' y='260' />
			<punto x='545' y='260' />
			<punto x='550' y='260' />
			<punto x='555' y='260' />
			<punto x='560' y='260' />
			<punto x='565' y='260' />
			<punto x='570' y='260' />
			<punto x='575' y='260' />
			<punto x='580' y='260' />
			<punto x='585' y='260' />
			<punto x='590' y='260' />
			<punto x='595' y='260' />
			<punto x='600' y='260' />
			<punto x='605' y='260' />
			<punto x='610' y='260' />
			<punto x='615' y='260' />
			<punto x='620' y='260' />
			<punto x='625' y='260' />
			<punto x='630' y='260' />
		</conexion>
		<conexion>
			<origen x='600' y='560' />
			<destino x='635' y='560' />
			<punto x='605' y='560' />
			<punto x='610' y='560' />
			<punto x='615' y='560' />
			<punto x='620' y='560' />
			<punto x='625' y='560' />
			<punto x='630' y='560' />
		</conexion>
		<conexion>
			<origen x='560' y='380' />
			<destino x='635' y='380' />
			<punto x='565' y='380' />
			<punto x='570' y='380' />
			<punto x='575' y='380' />
			<punto x='580' y='380' />
			<punto x='585' y='380' />
			<punto x='590' y='380' />
			<punto x='595' y='380' />
			<punto x='600' y='380' />
			<punto x='605' y='380' />
			<punto x='610' y='380' />
			<punto x='615' y='380' />
			<punto x='620' y='380' />
			<punto x='625' y='380' />
			<punto x='630' y='380' />
		</conexion>
		<conexion>
			<origen x='585' y='700' />
			<destino x='635' y='700' />
			<punto x='590' y='700' />
			<punto x='595' y='700' />
			<punto x='600' y='700' />
			<punto x='605' y='700' />
			<punto x='610' y='700' />
			<punto x='615' y='700' />
			<punto x='620' y='700' />
			<punto x='625' y='700' />
			<punto x='630' y='700' />
		</conexion>
		<conexion>
			<origen x='350' y='350' />
			<destino x='350' y='325' />
			<punto x='350' y='345' />
			<punto x='350' y='340' />
			<punto x='350' y='335' />
			<punto x='350' y='330' />
		</conexion>
		<conexion>
			<origen x='355' y='320' />
			<destino x='390' y='320' />
			<punto x='360' y='320' />
			<punto x='365' y='320' />
			<punto x='370' y='320' />
			<punto x='375' y='320' />
			<punto x='380' y='320' />
			<punto x='385' y='320' />
		</conexion>
		<conexion>
			<origen x='330' y='350' />
			<destino x='330' y='305' />
			<punto x='330' y='345' />
			<punto x='330' y='340' />
			<punto x='330' y='335' />
			<punto x='330' y='330' />
			<punto x='330' y='325' />
			<punto x='330' y='320' />
			<punto x='330' y='315' />
			<punto x='330' y='310' />
		</conexion>
		<conexion>
			<origen x='335' y='300' />
			<destino x='390' y='300' />
			<punto x='340' y='300' />
			<punto x='345' y='300' />
			<punto x='350' y='300' />
			<punto x='355' y='300' />
			<punto x='360' y='300' />
			<punto x='365' y='300' />
			<punto x='370' y='300' />
			<punto x='375' y='300' />
			<punto x='380' y='300' />
			<punto x='385' y='300' />
		</conexion>
		<conexion>
			<origen x='310' y='350' />
			<destino x='310' y='285' />
			<punto x='310' y='345' />
			<punto x='310' y='340' />
			<punto x='310' y='335' />
			<punto x='310' y='330' />
			<punto x='310' y='325' />
			<punto x='310' y='320' />
			<punto x='310' y='315' />
			<punto x='310' y='310' />
			<punto x='310' y='305' />
			<punto x='310' y='300' />
			<punto x='310' y='295' />
			<punto x='310' y='290' />
		</conexion>
		<conexion>
			<origen x='315' y='280' />
			<destino x='390' y='280' />
			<punto x='320' y='280' />
			<punto x='325' y='280' />
			<punto x='330' y='280' />
			<punto x='335' y='280' />
			<punto x='340' y='280' />
			<punto x='345' y='280' />
			<punto x='350' y='280' />
			<punto x='355' y='280' />
			<punto x='360' y='280' />
			<punto x='365' y='280' />
			<punto x='370' y='280' />
			<punto x='375' y='280' />
			<punto x='380' y='280' />
			<punto x='385' y='280' />
		</conexion>
		<conexion>
			<origen x='290' y='350' />
			<destino x='290' y='265' />
			<punto x='290' y='345' />
			<punto x='290' y='340' />
			<punto x='290' y='335' />
			<punto x='290' y='330' />
			<punto x='290' y='325' />
			<punto x='290' y='320' />
			<punto x='290' y='315' />
			<punto x='290' y='310' />
			<punto x='290' y='305' />
			<punto x='290' y='300' />
			<punto x='290' y='295' />
			<punto x='290' y='290' />
			<punto x='290' y='285' />
			<punto x='290' y='280' />
			<punto x='290' y='275' />
			<punto x='290' y='270' />
		</conexion>
		<conexion>
			<origen x='295' y='260' />
			<destino x='335' y='260' />
			<punto x='300' y='260' />
			<punto x='305' y='260' />
			<punto x='310' y='260' />
			<punto x='315' y='260' />
			<punto x='320' y='260' />
			<punto x='325' y='260' />
			<punto x='330' y='260' />
		</conexion>
		<conexion>
			<origen x='290' y='255' />
			<destino x='290' y='215' />
			<punto x='290' y='250' />
			<punto x='290' y='245' />
			<punto x='290' y='240' />
			<punto x='290' y='235' />
			<punto x='290' y='230' />
			<punto x='290' y='225' />
			<punto x='290' y='220' />
		</conexion>
		<conexion>
			<origen x='310' y='275' />
			<destino x='310' y='215' />
			<punto x='310' y='270' />
			<punto x='310' y='265' />
			<punto x='310' y='260' />
			<punto x='310' y='255' />
			<punto x='310' y='250' />
			<punto x='310' y='245' />
			<punto x='310' y='240' />
			<punto x='310' y='235' />
			<punto x='310' y='230' />
			<punto x='310' y='225' />
			<punto x='310' y='220' />
		</conexion>
		<conexion>
			<origen x='330' y='295' />
			<destino x='330' y='215' />
			<punto x='330' y='290' />
			<punto x='330' y='285' />
			<punto x='330' y='280' />
			<punto x='330' y='275' />
			<punto x='330' y='270' />
			<punto x='330' y='265' />
			<punto x='330' y='260' />
			<punto x='330' y='255' />
			<punto x='330' y='250' />
			<punto x='330' y='245' />
			<punto x='330' y='240' />
			<punto x='330' y='235' />
			<punto x='330' y='230' />
			<punto x='330' y='225' />
			<punto x='330' y='220' />
		</conexion>
		<conexion>
			<origen x='370' y='485' />
			<destino x='370' y='505' />
			<punto x='370' y='490' />
			<punto x='370' y='495' />
			<punto x='370' y='500' />
		</conexion>
		<conexion>
			<origen x='370' y='515' />
			<destino x='370' y='615' />
			<punto x='370' y='520' />
			<punto x='370' y='525' />
			<punto x='370' y='530' />
			<punto x='370' y='535' />
			<punto x='370' y='540' />
			<punto x='370' y='545' />
			<punto x='370' y='550' />
			<punto x='370' y='555' />
			<punto x='370' y='560' />
			<punto x='370' y='565' />
			<punto x='370' y='570' />
			<punto x='370' y='575' />
			<punto x='370' y='580' />
			<punto x='370' y='585' />
			<punto x='370' y='590' />
			<punto x='370' y='595' />
			<punto x='370' y='600' />
			<punto x='370' y='605' />
			<punto x='370' y='610' />
		</conexion>
		<conexion>
			<origen x='290' y='485' />
			<destino x='290' y='505' />
			<punto x='290' y='490' />
			<punto x='290' y='495' />
			<punto x='290' y='500' />
		</conexion>
		<conexion>
			<origen x='290' y='515' />
			<destino x='540' y='580' />
			<punto x='290' y='520' />
			<punto x='290' y='525' />
			<punto x='290' y='530' />
			<punto x='290' y='535' />
			<punto x='290' y='540' />
			<punto x='290' y='545' />
			<punto x='290' y='550' />
			<punto x='290' y='555' />
			<punto x='290' y='560' />
			<punto x='290' y='565' />
			<punto x='290' y='570' />
			<punto x='290' y='575' />
			<punto x='290' y='580' />
			<punto x='290' y='585' />
			<punto x='295' y='585' />
			<punto x='300' y='585' />
			<punto x='305' y='585' />
			<punto x='310' y='585' />
			<punto x='315' y='585' />
			<punto x='320' y='585' />
			<punto x='325' y='585' />
			<punto x='330' y='585' />
			<punto x='335' y='585' />
			<punto x='340' y='585' />
			<punto x='345' y='585' />
			<punto x='350' y='585' />
			<punto x='355' y='585' />
			<punto x='360' y='585' />
			<punto x='365' y='585' />
			<punto x='370' y='585' />
			<punto x='375' y='585' />
			<punto x='380' y='585' />
			<punto x='385' y='585' />
			<punto x='390' y='585' />
			<punto x='395' y='585' />
			<punto x='400' y='585' />
			<punto x='405' y='585' />
			<punto x='410' y='585' />
			<punto x='415' y='585' />
			<punto x='420' y='585' />
			<punto x='425' y='585' />
			<punto x='430' y='585' />
			<punto x='435' y='585' />
			<punto x='440' y='585' />
			<punto x='445' y='585' />
			<punto x='450' y='585' />
			<punto x='455' y='585' />
			<punto x='460' y='585' />
			<punto x='465' y='585' />
			<punto x='470' y='585' />
			<punto x='475' y='585' />
			<punto x='480' y='585' />
			<punto x='485' y='585' />
			<punto x='490' y='585' />
			<punto x='495' y='585' />
			<punto x='500' y='585' />
			<punto x='505' y='585' />
			<punto x='510' y='585' />
			<punto x='515' y='585' />
			<punto x='520' y='585' />
			<punto x='525' y='585' />
			<punto x='530' y='585' />
			<punto x='535' y='585' />
			<punto x='540' y='585' />
		</conexion>
		<conexion>
			<origen x='305' y='510' />
			<destino x='295' y='510' />
			<punto x='300' y='510' />
		</conexion>
		<conexion>
			<origen x='385' y='510' />
			<destino x='375' y='510' />
			<punto x='380' y='510' />
		</conexion>
		<conexion>
			<origen x='350' y='315' />
			<destino x='350' y='215' />
			<punto x='350' y='310' />
			<punto x='350' y='305' />
			<punto x='350' y='300' />
			<punto x='350' y='295' />
			<punto x='350' y='290' />
			<punto x='350' y='285' />
			<punto x='350' y='280' />
			<punto x='350' y='275' />
			<punto x='350' y='270' />
			<punto x='350' y='265' />
			<punto x='350' y='260' />
			<punto x='350' y='255' />
			<punto x='350' y='250' />
			<punto x='350' y='245' />
			<punto x='350' y='240' />
			<punto x='350' y='235' />
			<punto x='350' y='230' />
			<punto x='350' y='225' />
			<punto x='350' y='220' />
		</conexion>
		<conexion>
			<origen x='290' y='205' />
			<destino x='230' y='180' />
			<punto x='290' y='200' />
			<punto x='290' y='195' />
			<punto x='290' y='190' />
			<punto x='290' y='185' />
			<punto x='285' y='185' />
			<punto x='280' y='185' />
			<punto x='275' y='185' />
			<punto x='270' y='185' />
			<punto x='265' y='185' />
			<punto x='260' y='185' />
			<punto x='255' y='185' />
			<punto x='250' y='185' />
			<punto x='245' y='185' />
			<punto x='240' y='185' />
			<punto x='235' y='185' />
			<punto x='230' y='185' />
		</conexion>
		<conexion>
			<origen x='350' y='205' />
			<destino x='410' y='180' />
			<punto x='350' y='200' />
			<punto x='350' y='195' />
			<punto x='350' y='190' />
			<punto x='350' y='185' />
			<punto x='355' y='185' />
			<punto x='360' y='185' />
			<punto x='365' y='185' />
			<punto x='370' y='185' />
			<punto x='375' y='185' />
			<punto x='380' y='185' />
			<punto x='385' y='185' />
			<punto x='390' y='185' />
			<punto x='395' y='185' />
			<punto x='400' y='185' />
			<punto x='405' y='185' />
			<punto x='410' y='185' />
		</conexion>
		<conexion>
			<origen x='330' y='205' />
			<destino x='350' y='140' />
			<punto x='330' y='200' />
			<punto x='330' y='195' />
			<punto x='330' y='190' />
			<punto x='330' y='185' />
			<punto x='330' y='180' />
			<punto x='330' y='175' />
			<punto x='330' y='170' />
			<punto x='330' y='165' />
			<punto x='330' y='160' />
			<punto x='330' y='155' />
			<punto x='330' y='150' />
			<punto x='330' y='145' />
			<punto x='335' y='145' />
			<punto x='340' y='145' />
			<punto x='345' y='145' />
			<punto x='350' y='145' />
		</conexion>
		<conexion>
			<origen x='310' y='205' />
			<destino x='290' y='140' />
			<punto x='310' y='200' />
			<punto x='310' y='195' />
			<punto x='310' y='190' />
			<punto x='310' y='185' />
			<punto x='310' y='180' />
			<punto x='310' y='175' />
			<punto x='310' y='170' />
			<punto x='310' y='165' />
			<punto x='310' y='160' />
			<punto x='310' y='155' />
			<punto x='310' y='150' />
			<punto x='310' y='145' />
			<punto x='305' y='145' />
			<punto x='300' y='145' />
			<punto x='295' y='145' />
			<punto x='290' y='145' />
		</conexion>
	</componentes>
</proyecto>