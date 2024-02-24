package televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this.control;
	}
	public void turnOn() {
		this.tv.estado = true;
	}
	public void turnOff() {
		this.tv.estado = false;
	}
	public void canalUp() {
		if(this.tv.estado == True) {
		if(this.tv.canal==120) {
			;
		}
		else {
			this.tv.canal++;
		}
		}

	}
	public void canalDown() {
		if(this.tv.estado == True) {
		if(this.tv.canal==1) {
			;
		}else {
			this.tv.canal--;	
		}
		}
	}
	
	public void volumenDown() {
		if(this.tv.estado == True) {
			if(this.tv.volumen <= 7) {
				this.volumen--;
			}
		}
		
	}
	public void voluemUp() {
		if(this.tv.estado == True) {
			if(this.tv.volumen >= 0) {
				this.tv.volumen++;
			}
		}
	}
	public void setCanal(int canal) {
		this.tv.canal = canal;
	}
	public void setVolumen(int volumen) {
		this.tv.volumen = volumen;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public TV getTv() {
		return this.tv;
	}
}
