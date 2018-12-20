<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/constants.jspf" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Personaje</title>
		<link rel="stylesheet" type="text/css" href="css/estilos.css">
		 <meta charset="UTF-8">
	</head>
	
	<body>
		<script type="text/javascript" src="js/src/character_sheet_functions.js"></script>

		<form method="post" action="NewCharacterSheet">
			<div id="datosBasicos" class="contenedor">
				<div class="flex">
					<fieldset id="personaje" class="w-50">
						<legend>Nombre del personaje</legend>
						<span class="texto"><input type="text" name="<%=CharacterSheetForm.NAME%>" id="<%=CharacterSheetForm.NAME%>" placeholder="Character Name"></span>
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
							<span class="texto"><input type="text" name="<%=CharacterSheetForm.LEVEL%>" id="<%=CharacterSheetForm.LEVEL%>" placeholder="4"></span>
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
						<tr>
							<th class="medium">Nombre<br>caract.</th>
							<th class="medium">Punt.<br> caract.</th>
							<th class="medium">Mod.<br> caract.</th>
							<th class="medium">Punt.<br> temporal</th>
							<th class="medium">Mod.<br> temporal</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="border-bold">
								<span class="big bold">FUE</span>
								<br>
								<span class="little">FUERZA</span>
							</td>
							<td class="border-normal"><input id="punt_caract_fuerza" type="number" min="0" step="1" value="0" oninput="attributeMod('STR')"></td>
							<td class="border-normal"><input id="mod_caract_fuerza" type="number" value="-5" readonly></td>
							<td class="border-ligth"><input id="punt_temp_fuerza" type="number" min="0" step="1" value="0" oninput="attributeMod('STR')"></td>
							<td class="border-ligth"><input  id="mod_temp_fuerza" type="number" value="-5" readonly></td>
						</tr>
						<tr>
							<td class="border-bold">
								<span class="big bold">DES</span>
								<br>
								<span class="little">DESTREZA</span>
							</td>
							<td class="border-normal"><input id="punt_caract_destreza" type="number" min="0" step="1" value="0" oninput="attributeMod('DEX')"></td>
							<td class="border-normal"><input id="mod_caract_destreza" type="number" value="-5" readonly></td>
							<td class="border-ligth"><input id="punt_temp_destreza" type="number" min="0" step="1" value="0" oninput="attributeMod('DEX')"></td>
							<td class="border-ligth"><input  id="mod_temp_destreza" type="number" value="-5" readonly></td>
						</tr>
						<tr>
							<td class="border-bold">
								<span class="big bold">CON</span>
								<br>
								<span class="little">CONSTITUCI”N</span>
							</td>
							<td class="border-normal"><input id="punt_caract_constitucion" type="number" min="0" step="1" value="0" oninput="attributeMod('CON')"></td>
							<td class="border-normal"><input id="mod_caract_constitucion" type="number" value="-5" readonly></td>
							<td class="border-ligth"><input id="punt_temp_constitucion" type="number" min="0" step="1" value="0" oninput="attributeMod('CON')"></td>
							<td class="border-ligth"><input  id="mod_temp_constitucion" type="number" value="-5" readonly></td>
						</tr>
						<tr>
							<td class="border-bold">
								<span class="big bold">INT</span>
								<br>
								<span class="little">INTELIGENCIA</span>
							</td>
							<td class="border-normal"><input id="punt_caract_inteligencia" type="number" min="0" step="1" value="0" oninput="attributeMod('INT')"></td>
							<td class="border-normal"><input id="mod_caract_inteligencia" type="number" value="-5" readonly></td>
							<td class="border-ligth"><input id="punt_temp_inteligencia" type="number" min="0" step="1" value="0" oninput="attributeMod('INT')"></td>
							<td class="border-ligth"><input  id="mod_temp_inteligencia" type="number" value="-5" readonly></td>
						</tr>
						<tr>
							<td class="border-bold">
								<span class="big bold">SAB</span>
								<br>
								<span class="little">SABIDURÕçA</span>
							</td>
							<td class="border-normal"><input id="punt_caract_sabiduria" type="number" min="0" step="1" value="0" oninput="attributeMod('WIS')"></td>
							<td class="border-normal"><input id="mod_caract_sabiduria" type="number" value="-5" readonly></td>
							<td class="border-ligth"><input id="punt_temp_sabiduria" type="number" min="0" step="1" value="0" oninput="attributeMod('WIS')"></td>
							<td class="border-ligth"><input  id="mod_temp_sabiduria" type="number" value="-5" readonly></td>
						</tr>
						<tr>
							<td class="border-bold">
								<span class="big bold">CAR</span>
								<br>
								<span class="little">CARISMA</span>
							</td>
							<td class="border-normal"><input id="punt_caract_carisma" type="number" min="0" step="1" value="0" oninput="attributeMod('CHA')"></td>
							<td class="border-normal"><input id="mod_caract_carisma" type="number" value="-5" readonly></td>
							<td class="border-ligth"><input id="punt_temp_carisma" type="number" min="0" step="1" value="0" oninput="attributeMod('CHA')"></td>
							<td class="border-ligth"><input  id="mod_temp_carisma" type="number" value="-5" readonly></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div id="salud" class="contenedor w-60 right">
				<table>
					<thead>
						<tr>
							<th class="w-15"></th>
							<th class="medium bold w-10">Total</th>
							<th class="medium w-30">Heridas actuales</th>
							<th class="medium w-15">DaÒo no letal</th>
							<th class="big w-25">Velocidad</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="border-bold">
								<span class="big bold">PG</span>
								<br>
								<span class="little">PUNTOS DE GOLPE</span>
							</td>
							<td id="pg-totales" class="border-normal">12</td>
							<td id="heridas" class="border-normal">2 -> 10/12</td>
							<td id="no-letal" class="border-normal">0</td>
							<td id="velocidad" class="border-normal">30'</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div id="CA" class="contenedor w-60 right">
				<table>
					<tbody>
						<tr>
							<td class="border-bold">
								<span class="big bold">CA</span>
								<br>
								<span class="little">CLASE DE ARMADURA</span>
							</td>
							<td id="CA-total" class="border-bottom-normal igual">17</td>
							<td class="border-none mas">10</td>
							<td id="bonificador-armadura" class="border-bottom-normal mas">3</td>
							<td id="bonificador-escudo" class="border-bottom-normal mas">2</td>
							<td id="bonificador-destreza" class="border-bottom-normal mas">2</td>
							<td id="bonificador-tam" class="border-bottom-normal mas">0</td>
							<td id="armadura-natural" class="border-bottom-normal mas">0</td>
							<td id="bonificador-desvio" class="border-bottom-normal mas">0</td>
							<td id="bonificador-varios" class="border-bottom-normal mas">0</td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td class="border-none"></td>
							<td class="medium bold border-none">TOTAL</td>
							<td class="little border-none">Clase Armadura <br>Base</td>
							<td class="little border-none">Bonif.<br>Armadura</td>
							<td class="little border-none">Bonif.<br>Escudo</td>
							<td class="little border-none">Mod.<br>Destreza</td>
							<td class="little border-none">Mod.<br>TamaÒo</td>
							<td class="little border-none">Armadura<br>natural</td>
							<td class="little border-none">Bonif.<br>DesvÌo</td>
							<td class="little border-none">Bonif.<br>Varios</td>
						</tr>
					</tfoot>
				</table>
			</div>
			<div id="Submit">
				<input type="submit" value="Submit">
			</div>
		</form>
	</body>

</html> 