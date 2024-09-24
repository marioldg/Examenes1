package examenCompra;

import java.util.ArrayList;

public class Vecino {
		ArrayList<Item> itemsVecino;
		ArrayList<Item> items;

		public Vecino() {
			itemsVecino = new ArrayList<>();
			items = new ArrayList<>();
		}

		public void fisgarCompra(String nombreItem, int precioItem) {
			Item nuevo = new Item(nombreItem, precioItem);
			itemsVecino.add(nuevo);
		}

		public boolean fisgarDestruccion(String nombreItem, int precioItem) {
			for (Item destruido : itemsVecino) {
				if (destruido.getNombre().equals(nombreItem) && destruido.getPrecio() == precioItem) {
					itemsVecino.remove(destruido);
					return true;
				}
			}
			return false;
		}

		public void comprar(String nombreItem, int precioItem) {
			Item comprado = new Item(nombreItem, precioItem);
			items.add(comprado);
		}

		public boolean destruir(String nombreItem, int precioItem) {
			for (Item destruido : items) {
				if (destruido.getNombre().equals(nombreItem) && destruido.getPrecio() == precioItem) {
					items.remove(destruido);
					return true;
				}
			}
			return false;
		}

		public boolean voyGanando() {
			for (Item suyos : itemsVecino) {
				boolean y = false;
				for (Item mios : items) {
					if (mios.getNombre().equals(suyos.getNombre())&& mios.getPrecio() >= suyos.getPrecio()*1.2) {
						y = true;
					}
				}
				if (y == false) {
					return false;
				}
			}
			return true;
		}
		

		public Item[] comprasPendientes() {
			ArrayList<Item> comprasPendientes = new ArrayList<>();

			for (Item suyos : itemsVecino) {
				boolean y = false;
				for (Item mios : items) {
					if (suyos.getNombre().equals(mios.getNombre()) && mios.getPrecio() >= suyos.getPrecio() * 1.2) {
						y = true;
					}
				}
				if (y == false) {
					agregar(comprasPendientes, new Item (suyos.getNombre (), suyos.getPrecio() * 120/ 100));
				}

			}

			return comprasPendientes.toArray (new Item [0]);

		}

		public static void agregar(ArrayList<Item> pp, Item i) {
			int resultado = contiene(pp,i.getNombre());
			if(resultado == -1) {
				pp.add(i);
			} else if (i.getPrecio() > pp.get(resultado).getPrecio ()) {
				pp.remove(resultado);
				pp.add(i);
			}
		}

		public static int contiene(ArrayList<Item> buscar, String nombre) {
			for(int i = 0; i<buscar.size();i++) {
				if(buscar.get(i).getNombre().equals(nombre)) {
					return i;
				}
			}
			return -1;
			
			}
			
			
		}
