package gildedrose;


	
	import java.util.List;

	public class GildedRose extends  GilderCodigoPrincipal { //Patron de diseño factory methods
		
		public void updateQuality(List<Item> items) {
			
	GilderCodigoPrincipal  principal = new  GilderCodigoPrincipal ();///Instancia de la clase principal
		principal.updateQuality(items);///Esta instancia llama a la clase Quality Principal
		
		}
	}
	  