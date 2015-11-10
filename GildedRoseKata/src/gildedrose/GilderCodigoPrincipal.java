package gildedrose;

import java.util.List;

public class GilderCodigoPrincipal {
	MetodosDecCalidad metodosdecalidad = new MetodosDecCalidad(); ///instancia de clase qualitymethods
    ReducirCalidad reducir = new ReducirCalidad();//Intastancia de tres metodos para reducir calidad.
	

	
	public void updateQuality(List<Item> items) {
		for (Item item : items) {

			if (!item.getName().equals("Aged Brie")
					&& !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
				reducir.ReducirCalidad(item);///Llamar metodos de la clase QualityMethods para ahorrar codigo y no repetir
			} else {
				if (item.getQuality() < 50) {
					metodosdecalidad.AumentarCalidad1(item);
			
					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						reducir.Reducir(item, 11);
						reducir.Reducir(item, 6);
					}
				}
			}
			
			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
				metodosdecalidad.ObtenerShellmenor1(item);
			}

			if (item.getSellIn() < 0) {
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						reducir.ReducirCalidad(item);
					} else {
						metodosdecalidad.CalidadCERO(item);
					}
				} else {
					reducir.CalidadMenora50(item);
				}
				
			}
		}
	}


}
	
  