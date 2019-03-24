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

//Usando if
public boolean isSameYear(Date Date2){
	if(this.year == Date2.year){
		return true;
	}
	return false;
}
public boolean isSameMonth(Date Date2){
	if(this.month == Date2.month){
		return true;
	}
	return false;
}
public boolean isSameDay(Date Date2){
	if(this.day == Date2.day){
		return true;
	}
	return false;
}
//Sin usar if
public boolean isSame(Date Date2){
	return this.year == Date2.year && this.month == Date2.month && this.day == Date2.day;
}
public String monthName(){
month = this.month;
String monthName = "Enero";
	switch(month){
		case 1:
		monthName = "Enero";
		break;
		case 2:
		monthName = "Febrero";
		break;
		case 3:
		monthName = "Marzo";
		break;
		case 4:
		monthName = "Abril";
		break;
		case 5:
		monthName = "Mayo";
		break;
		case 6:
		monthName = "Junio";
		break;
		case 7:
		monthName = "Julio";
		break;
		case 8:
		monthName = "Agosto";
		break;
		case 9:
		monthName = "Septiembre";
		break;
		case 10:
		monthName = "Octubre";
		break;
		case 11:
		monthName = "Noviembre";
		break;
		case 12:
		monthName = "Diciembre";
		break;
		
		default:
		System.out.println("Invalid month value");
	}
	return monthName;
}
public String Season(){
month = this.month;
String season = "Invierno";		
	switch(month){
		case 12:case 1: case 2:
		season = "Invierno";
		break;
		case 3:case 4: case 5:
		season = "Primavera";
		break;
		case 6:case 7: case 8:
		season = "Verano";
		break;
		case 9:case 10: case 11:
		season = "Otonio";
		break;
		default:
		System.out.println("Invalid month value");
	}
	return season;
}
public int monthsToEnd(int month){
int monthsLeft = 0;
	if(month<12){
		monthsLeft = 12 - month;
	}
	else{
		System.out.println("Invalid month value");
	}
return monthsLeft;
}
public int daysEndMonth(){
int daysLeft = 0;
	switch(this.month){
		case 1:
		daysLeft = 31 - this.day;
		break;
		case 2:
		if(bisiesto() == true){
			daysLeft = 29 - this.day;
		}		
		if(bisiesto() == false){
			daysLeft = 28 - this.day;
		}
		break;
		case 3:
		daysLeft = 31 - this.day;
		break;
		case 4:
		daysLeft = 30 - this.day;
		break;
		case 5:
		daysLeft = 31 - this.day;
		break;
		case 6:
		daysLeft = 30 - this.day;
		break;
		case 7:
		daysLeft = 31 - this.day;
		break;
		case 8:
		daysLeft = 31 - this.day;
		break;
		case 9:
		daysLeft = 30 - this.day;
		break;
		case 10:
		daysLeft = 31 - this.day;
		break;
		case 11:
		daysLeft = 30 - this.day;
		break;
		case 12:
		daysLeft = 31 - this.day;
		break;
		default:
		System.out.println("Invalid month value");
	}
	return daysLeft;
} 
public String sameDayMonth(){
String sameDay = null;
	switch(this.month){
		case 1:
		sameDay = "Marzo, Mayo, Julio, Agosto, Octubre, Diciembre";
		break;

		case 2:
		sameDay = "No hay meses con esos dias";
		break;

		case 3:
		sameDay = "Enero, Mayo, Julio, Agosto, Octubre, Diciembre";
		break;

		case 4:
		sameDay = "Junio, Septiembre, Noviembre";
		break;

		case 5:
		sameDay = "Marzo, Enero, Julio, Agosto, Octubre, Diciembre";
		break;

		case 6:
		sameDay = "Abril, Septiembre, Noviembre";
		break;

		case 7:
		sameDay = "Marzo, Mayo, Enero, Agosto, Octubre, Diciembre";
		break;

		case 8:
		sameDay = "Marzo, Mayo, Julio, Enero, Octubre, Diciembre";
		break;

		case 9:
		sameDay = "Junio, Abril, Noviembre";
		break;

		case 10:
		sameDay = "Marzo, Mayo, Julio, Agosto, Enero, Diciembre";
		break;

		case 11:
		sameDay = "Junio, Septiembre, Abril";
		break;

		case 12:
		sameDay = "Marzo, Mayo, Julio, Agosto, Octubre, Enero";
		break;
		default:
		System.out.println("Invalid month value");
	}
	return sameDay;
}
public int daysFromStart(Date date2){
int daysPassed = 0;
	switch(date2.month){
		case 12:
		daysPassed=daysPassed+31;
		case 11:
		daysPassed=daysPassed+30;
		case 10:
		daysPassed=daysPassed+31;
		case 9:
		daysPassed=daysPassed+30;
		case 8:
		daysPassed=daysPassed+31;
		case 7:
		daysPassed=daysPassed+31;
		case 6:
		daysPassed=daysPassed+30;
		case 5:
		daysPassed=daysPassed+31;
		case 4:
		daysPassed=daysPassed+30;
		case 3:
		daysPassed=daysPassed+31;
		case 2:
		daysPassed=daysPassed+28;
		case 1:
		daysPassed=daysPassed+31;
		break;
		default:
		System.out.println("Invalid month value");
	}
	daysPassed = daysPassed - date2.day;
	return daysPassed;
}
public int random1(){
int randMonth = 0;
int randDay = 0;
int contador = 0;
	do{
		randMonth = (int) Math.random()*12 + 1;
		randDay = (int)Math.random()*31 + 1;
		contador++;
	}
	while(randDay == this.day && randMonth == this.month);
		return contador;

}
public int random2(){
int randMonth = 0;
int randDay = 0;
int contador = 0;
	while(randDay != this.day && randMonth != this.month){	
		randMonth = (int)Math.random()*12 + 1;
		randDay = (int)Math.random()*31 + 1;
		contador++;
	}
		return contador;
}
public int weekDayGiven(Date date2, int weekDay){
int totalDays = daysFromStart(date2);
int days2 = totalDays%7;
int days3= days2 + weekDay;
int dayOfWeek = 0;	
	switch(days3){
	case 1:case 8:
		dayOfWeek = 1;
	break;
	case 2:case 9:
		dayOfWeek = 2;
	break;
	case 3:case 10:
		dayOfWeek = 3;
	break;
	case 4:case 11:
		dayOfWeek = 4;
	break;
	case 5:case 12:
		dayOfWeek = 5;
	break;
	case 6:case 13:
		dayOfWeek = 6;
	break;
	case 7:case 14:
		dayOfWeek = 7;
	break;
	default:
		System.out.println("Invalid date value");;
	}		
return dayOfWeek;
}
public String toString(Date date2){
String salida;
salida = date2.day+" de " +date2.monthName()+ " de " + date2.year;
return salida;
}
}



