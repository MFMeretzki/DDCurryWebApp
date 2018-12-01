 <!DOCTYPE html>
<html>
	<head>
		<title>Personaje</title>
		<link rel="stylesheet" type="text/css" href="css/estilos.css">
		 <meta charset="UTF-8">
	</head>
	
	<body>
		<div id="datosBasicos" class="contenedor">
			<div class="flex">
				<fieldset id="personaje" class="w-50">
					<legend>Nombre del personaje</legend>
					<span class="texto">Dodic</span>
				</fieldset>
				<fieldset id="jugador" class="w-50">
					<legend>Jugador</legend>
					<span class="texto">Suso</span>
				</fieldset>
			</div>
			<div class="flex">
				<div class="flex w-50">
					<fieldset id="clase" class="w-50">
						<legend>Clase</legend>
						<span class="texto">Guerrero</span>
					</fieldset>
					<fieldset id="raza" class="w-50">
						<legend>Raza</legend>
						<span class="texto">Enano</span>
					</fieldset>
				</div>
				<div class="flex w-50">
					<fieldset id="alineamiento" class="w-30">
						<legend>Alineamiento</legend>
						<span class="texto">Legal Neutral</span>
					</fieldset>
					<fieldset id="nivel" class="w-30">
						<legend>Nivel</legend>
						<span class="texto">4</span>
					</fieldset>
					<fieldset id="deidad" class="w-40">
						<legend>Deidad</legend>
						<span class="texto">Pelor</span>
					</fieldset>
				</div>
			</div>
		</div>
		
		<div id="caracteristicas" class="contenedor w-30 left">
			<table>
				<thead>
					<th class="medium">Nombre<br>caract.</th>
					<th class="medium">Punt.<br> caract.</th>
					<th class="medium">Mod.<br> caract.</th>
					<th class="medium">Punt.<br> temporal</th>
					<th class="medium">Mod.<br> temporal</th>
				</thead>
				<tbody>
					<tr>
						<td class="border-bold">
							<span class="big bold">FUE</span>
							<br>
							<span class="little">FUERZA</span>
						</td>
						<td class="border-normal" id="punt_caract">0</td>
						<td class="border-normal" id="mod_caract">0</td>
						<td class="border-ligth" id="punt_temp">0</td>
						<td class="border-ligth" id="mod_temp">0</td>
					</tr>
					<tr>
						<td class="border-bold">
							<span class="big bold">DES</span>
							<br>
							<span class="little">DESTREZA</span>
						</td>
						<td class="border-normal" id="punt_caract">0</td>
						<td class="border-normal" id="mod_caract">0</td>
						<td class="border-ligth" id="punt_temp">0</td>
						<td class="border-ligth" id="mod_temp">0</td>
					</tr>
					<tr>
						<td class="border-bold">
							<span class="big bold">CON</span>
							<br>
							<span class="little">CONSTITUCIÓN</span>
						</td>
						<td class="border-normal" id="punt_caract">0</td>
						<td class="border-normal" id="mod_caract">0</td>
						<td class="border-ligth" id="punt_temp">0</td>
						<td class="border-ligth" id="mod_temp">0</td>
					</tr>
					<tr>
						<td class="border-bold">
							<span class="big bold">INT</span>
							<br>
							<span class="little">INTELIGENCIA</span>
						</td>
						<td class="border-normal" id="punt_caract">0</td>
						<td class="border-normal" id="mod_caract">0</td>
						<td class="border-ligth" id="punt_temp">0</td>
						<td class="border-ligth" id="mod_temp">0</td>
					</tr>
					<tr>
						<td class="border-bold">
							<span class="big bold">SAB</span>
							<br>
							<span class="little">SABIDURÍA</span>
						</td>
						<td class="border-normal" id="punt_caract">0</td>
						<td class="border-normal" id="mod_caract">0</td>
						<td class="border-ligth" id="punt_temp">0</td>
						<td class="border-ligth" id="mod_temp">0</td>
					</tr>
					<tr>
						<td class="border-bold">
							<span class="big bold">CAR</span>
							<br>
							<span class="little">CARISMA</span>
						</td>
						<td class="border-normal" id="punt_caract">0</td>
						<td class="border-normal" id="mod_caract">0</td>
						<td class="border-ligth" id="punt_temp">0</td>
						<td class="border-ligth" id="mod_temp">0</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div id="salud" class="contenedor w-60 right">
			<table>
				<thead>
					<th class="w-15"></th>
					<th class="medium bold w-10">Total</th>
					<th class="medium w-30">Heridas actuales</th>
					<th class="medium w-15">Daño no letal</th>
					<th class="big w-25">Velocidad</th>
				</thead>
				<tbody>
					<td class="border-bold">
						<span class="big bold">PG</span>
						<br>
						<span class="little">PUNTOS DE GOLPE</span>
					</td>
					<td id="pg-totales" class="border-normal">12</td>
					<td id="heridas" class="border-normal">2 -> 10/12</td>
					<td id="no-letal" class="border-normal">0</td>
					<td id="velocidad" class="border-normal">30'</td>
				</tbody>
			</table>
		</div>
		<div id="CA" class="contenedor w-60 right">
			<table>
				<tbody>
					<td class="border-bold">
						<span class="big bold">CA</span>
						<br>
						<span class="little">CLASE DE ARMADURA</span>
					</td>
					<td id="CA-total" class="border-normal">17</td>
					<td class="little">=</td>
					<td>10</td>
					<td class="little">+</td>
					<td id="bonificador-armadura" class="border-normal">3</td>
					<td class="little">+</td>
					<td id="bonificador-escudo" class="border-normal">2</td>
					<td class="little">+</td>
					<td id="bonificador-destreza" class="border-normal">2</td>
					<td class="little">+</td>
					<td id="bonificador-tam" class="border-normal">0</td>
					<td class="little">+</td>
					<td id="armadura-natural" class="border-normal">0</td>
					<td class="little">+</td>
					<td id="bonificador-desvio" class="border-normal">0</td>
					<td class="little">+</td>
					<td id="bonificador-varios" class="border-normal">0</td>
				</tbody>
				<tfoot>
				</tfoot>
			</table>
		</div>
	</body>

</html> 