package termostato;

public class Termostato {

	private int temperatura;// temperaturaDeseada
	private int temperaturaReal;
	private int modo; // de 0-1
	private boolean estadoCaldera;

	public Termostato(int temperatura) {

		// MODO AUTOMATICO
		this.modo = 2;
		// CALCULAR TEMEPERATURA DESEADA
		setTemperaturaDeseada(temperatura);
		getEstadoCaldera();
	}

	public void setTemperaturaDeseada(int temperaturaDada) {

		if (temperaturaDada >= 5 && temperaturaDada <= 26) {
			this.temperatura = temperaturaReal;
		}
		if (temperaturaDada < 5) {
			this.temperatura = 5;
		}
		if (temperaturaDada > 26) {
			this.temperatura = 26;

		}

	}

	public void setModo(int modo) {

		this.modo = modo;
	}

	public boolean getEstadoCaldera() {

		// SI ES AUTOMATICO
		if (modo != 0 && modo != 1) {
			if (temperaturaReal > temperatura) {
				estadoCaldera = false;
			}

		}
		// MANUAL APAGADO-MANUAL-ENCENDIDO
		if (temperaturaReal < temperatura) {

			estadoCaldera = true;

		} else if (modo == 1) {
			estadoCaldera = true;
		} else {
			estadoCaldera = false;
		}
		return estadoCaldera;
	}
	
	public void setTemperaturaReal(int temperatura) {
		//CAMBIA LA TEMPERATURA REAL POR LA TEMPERATURA
		this.temperaturaReal=temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura=temperatura;
	}
}
