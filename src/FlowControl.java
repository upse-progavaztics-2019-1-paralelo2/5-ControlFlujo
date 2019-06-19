
public class FlowControl {

	public static void main(String[] args) {

		int youtubeVisit = 500;
		if(youtubeVisit>1000) {
			System.out.println("$$$ Eres celebridad de Youtube...");
			System.out.println("A vacilar la vida");
		}else {

			if(youtubeVisit>500)
			{
				System.out.println("Aun hay esperanza");
			}
		}
		
		if(youtubeVisit>500 && youtubeVisit<1000)
		{
			System.out.println("Aun vas por buen camino, menos de 500 para ser celebridad!");
		}else if(youtubeVisit> 300)
		{
			System.out.println("Falta trabajar pero vale la pena.");
		}else if(youtubeVisit>100)
		{
			System.out.println("Al menos algunos manes aprecian tu trabajo.");
		}else if(youtubeVisit>20)
		{
			System.out.println("Por lo menos tu familia te dio like!");
		}else {
			System.out.println("Botate!");
		}
		
		switch(youtubeVisit)
		{
		case 50:
			System.out.println("Tienes algunas visitas");
			break;
		case 100:
			System.out.println("Comienzas a aparecer en el feed");
			break;
		case 500:
			System.out.println("Ya aparecen anuncios en tu canal");
			break;
		case 1000:
			System.out.println("Ya te pagaron al menos $1");
			break;
		case 5000:
			System.out.println("Te pagaron $10");
			break;
		case 10: 
			System.out.println("Ni para las colas!");
			break;
		default:
			System.out.println("Hey! Youtuber, algo raro esta pasando en tu canal!");
			break;
		}
		

		int reports=5;
		boolean banned = true;
		if(reports>5)
		{
			System.out.println("Te han banneado. GameOver!");
			banned = true;
		}

		if(banned==true) 
			System.out.println("Adios de Youtube, mejor anda a la U!");
		else
			System.out.println("Sigue en Youtube");
		
		String mensaje = (banned)? "Adios Youtube" : "La vida youtubera continua!" ;
		System.out.println(mensaje);

	}

}
