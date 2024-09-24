package examenFecha;

public class Fecha {
	private int dia;
	private int mes;
	private int ano;
	private boolean bisiesto;

	public Fecha(int dia, int mes, int ano, boolean bisiesto) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.bisiesto = bisiesto;

		fechaIncorrecta();
	}

	public boolean isBisiesto() {
		return bisiesto;
	}

	public void setBisiesto(boolean bisiesto) {
		this.bisiesto = bisiesto;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public void setFecha(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

	// get se utiliza cuando no hay parametros(void)
	public void fechaIncorrecta() {
		if (getAno() < 1901 || getAno() > 2099) {
			setFecha(1, 1, 1901);
		} else if (getMes() < 1 || getMes() > 12) {
			setFecha(1, 1, 1901);
		} else if ((getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11) && getDia() >= 31) {
			setFecha(1, 1, 1901);
		} else if ((getMes() == 1 || getMes() == 5 || getMes() == 7 || getMes() == 8 || getMes() == 10
				|| getMes() == 12) && getDia() > 31) {
			setFecha(1, 1, 1901);
		} else if (getMes() == 2 && bisiesto == true && getDia() > 29
				|| getMes() == 2 && bisiesto == false && getDia() > 28) {
			setFecha(1, 1, 1901);
		}
	}

	public void esBisiesto() {
		if (getAno() % 4 == 0) {
			setBisiesto(true);
		} else {
			setBisiesto(false);
		}
	}

	public void avanzar() {
		// fecha limite
		if (getAno() == 2099 && getMes() == 12 && getDia() == 31) {
			this.dia = getDia();
			this.mes = getMes();
			this.ano = getAno();

		}
		// meses 30d
		if ((getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11)) {
			if (getDia() >= 1 && getDia() <= 29) {
				setFecha(dia++, mes, ano);
			} else {
				setFecha(1, mes++, ano);
			}

		} // meses31 excepto diciembre
		if (getMes() == 1 || getMes() == 5 || getMes() == 7 || getMes() == 8 || getMes() == 10) {
			if (getDia() >= 1 && getDia() <= 30) {
				setFecha(dia++, mes, ano);
			} else {

				setFecha(1, mes++, ano);
			}
		} // diciembre
		if (getMes() == 12) {
			if (getDia() < 31) {
				setFecha(dia++, mes, ano);
			} else {
				setFecha(1, 1, ano++);
			}
		} // febrero
		if (getMes() == 2) {
			if ((bisiesto == true && getDia() <= 28) || (bisiesto == false && getDia() <= 27)) {
				setFecha(dia++, mes, ano);
			} else if ((bisiesto == true && getDia() == 29) || (bisiesto == false && getDia() == 28)) {
				setFecha(1, mes++, ano);
			}
		}

	}

	public void retroceder() {
		// fecha limite
		if (getAno() == 1901 && getMes() == 1 && getDia() == 1) {
			this.dia = getDia();
			this.mes = getMes();
			this.ano = getAno();

		}
		// meses 30d
		if ((getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11)) {
			if (getDia() > 1 && getDia() <= 30) {
				setFecha(dia--, mes, ano);
			} else {
				setFecha(31, mes--, ano);
			}
		} // meses31 excepto enero, marzo y agosto
		if (getMes() == 5 || getMes() == 7 || getMes() == 10 || getMes() == 12) {
			if (getDia() > 1 && getDia() <= 31) {
				setFecha(dia--, mes, ano);
			} else {

				setFecha(30, mes--, ano);
			}
		}//enero
		if(getMes()==1) {
			if(getDia()>1 && getDia()<=31) {
				setFecha(dia--, mes, ano);
			}else {
				setFecha(31, 12, ano--);
			}
		}//marzo
		if(getMes()==3) {
			if(getDia()>1 && getDia()<=31) {
				setFecha(dia--, mes, ano);
			}else if(bisiesto == true && getDia()==1) {
				setFecha(29, mes--, ano);
			}else {
				setFecha(28, mes, ano);
			}
			
		}//agosto
		if(getMes()==8) {
			if(getDia()>1 && getDia()<=31) {
				setFecha(dia--, mes, ano);
			}else {
				setFecha(31, mes--, ano);
			}
		}

	}
	
	public int comparar(Fecha fecha) {
		if(fecha == null) {
			return 0;
		}else if(this.ano>fecha.getAno()) {
			return -1;
		}else if(this.ano == fecha.getAno() && this.mes > fecha.getMes()) {
			return -1;
		}else if(this.ano == fecha.getAno() && this.mes == fecha.getMes() && this.dia > fecha.getDia()) {
			return -1;
		}else if(this.ano == fecha.getAno() && this.mes == fecha.getMes() && this.dia == fecha.getDia()) {
			return 0;
		}else {
			return 1;
		}
	}
	 public static Fecha[] ordenar (Fecha [] fechas) {
		 Fecha [] fechasOrdenadas  = new Fecha[100];
		 for(int i = 0; i <= fechas.length; i++ ) {
			 for(int k = 0; k <= fechasOrdenadas.length; k++ ) {
				 if(fechasOrdenadas[k].getAno()<fechas[i].getAno() && fechasOrdenadas[k].getMes()<fechas[i].getMes() && fechasOrdenadas[k].getDia()<fechas[i].getDia()) {
					 fechasOrdenadas[0] = fechas[i];
				 }
			 }
		 }
		 return fechasOrdenadas;
	 }
	
}
