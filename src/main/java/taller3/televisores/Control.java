package taller3.televisores;

public class Control {
	public TV tv;
	
	public void enlazar() {
		this.tv = tv;
		//tv.control = this.control;
	}
	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff(){
		this.tv.turnOff();
	}
	public void canalUp() {
		if(this.tv.getEstado() == True) {
		if(this.tv.getCanal()==120) {
			;
		}
		else {
			this.tv.canalUp();
		}
		}

	}
	public void canalDown() {
		if(this.tv.getEstado() == True) {
		if(this.tv.getCanal()==1) {
			;
		}else {
			this.tv.canalDown();	
		}
		}
	}
	
	public void volumenDown() {
		this.tv.volumendDown();
	}
	public void voluemUp() {
		this.tv.volumenUp();
	}
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public TV getTv(Tv tv) {
		return this.tv;
	}
}
