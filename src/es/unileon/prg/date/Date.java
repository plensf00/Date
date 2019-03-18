package es.unileon.prg.date;

/**
 * Clase que crea una fecha y realiza interacciones con ella
 * 
 * @author  plensf00
 * @version 1.0
 */

public class Date{

private int day;
private int month;
private int year;

public Date(int day, int month, int year)throws DateException{
	if(rightDate(day, month)==true){	
		this.day = day;
		this.month = month;
		this.year = year;
	}
	else{
	throw new DateException("Fecha no valida");
	}
	
}
public boolean rightDate(int day, int month){
boolean fecha;	
	switch(this.month){
		case 1:
		if(day>31 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 2:		
		if(bisiesto() == true && day>29 || day<0){
			fecha = false;
		}
		if(bisiesto() == false && day>28 || day<0){
			fecha = false;		
		}
		else{
			fecha = true;
		}
		break;
		case 3:
		if(day>31 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 4:
		if(day>30 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 5:
		if(day>31 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 6:
		if(day>30 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 7:
		if(day>31 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 8:
		if(day>30 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 9:
		if(day>30 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 10:
		if(day>31 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 11:
		if(day>30 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		case 12:
		if(day>31 || day<0){
			fecha = false;
		}
		else{
			fecha = true;
		}
		break;
		default:
		fecha = false;
	}
	return fecha;
}
public boolean bisiesto(){
boolean bis;
	if((this.year%400==0) || (this.year%4==0 && this.year%100!=0)){
		bis = true;
	}
	else{
		bis = false;
	}
	return bis;
}


public void setDay(int day) {
	if(this.rightDate(day, this.month));
		this.day = day;
}
public void setMonth(int mont) {
	if(this.rightDate(this.day, month));
		this.month = month;
}
public void setYear(int year) {
		this.year = year;
}
}
