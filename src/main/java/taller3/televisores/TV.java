package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private int numTV;
	
	public void setNumTV(int numTV) {
		this.numTV = numTV;
	}
	public int getNumTV() {
		return this.numTV;
	}	
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
	}
	
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public int getCanal() {
		return this.canal;
	}
	public int getPrecio() {
		return this.precio;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public Control getControl() {
		return this.control;
	}
	
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}	
	
	public void setControl(Control control) {
		this.control = control;
	}	
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if(this.estado == true) {
		if(this.canal==120) {
			;
		}
		else {
			this.canal++;
		}
		}

	}
	public void canalDown() {
		if(this.estado == true) {
		if(this.canal==1) {
			;
		}else {
			this.canal--;	
		}
		}
	}
	
	public void volumenDown() {
		if(this.estado == true) {
			if(this.volumen <= 7) {
				this.volumen--;
			}
		}
		
	}
	public void volumenUp() {
		if(this.estado == true) {
			if(this.volumen >= 0) {
				this.volumen++;
			}
		}
	}
	
	
}
