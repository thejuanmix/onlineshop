package com.es.eoi.shop.views;

import java.util.Scanner;

import com.es.eoi.shop.Main;
import com.es.eoi.shop.entities.Electronics;
import com.es.eoi.shop.entities.Food;
import com.es.eoi.shop.entities.Textile;
import com.es.eoi.shop.managers.ArticleManager;
import com.es.eoi.shop.utils.ArticleFactory;

public class Menu {

	private static int option = 0;

	public static void printMainMenu() {

		System.out.println("\nBIENVENIDO A MI TIENDA, INTRODUZCA UNA OPCION");
		System.out.println("1-GESTIONAR ARTICULOS");
		System.out.println("2-VER PEDIDOS");
		System.out.println("3-LISTAR ARTICULOS");
		System.out.println("4-COMPRAR ARTICULOS");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		option = scan.nextInt();
		switchInitialMenu(option);

	}

	public static void switchInitialMenu(int option) {
		switch (option) {
		case 1:
			System.out.println("");
			System.out.println("1-AÑADIR ARTÍCULOS");
			System.out.println("2-BORRAR ARTÍCULOS");

			Scanner scan = new Scanner(System.in);

			option = scan.nextInt();

			switchManageArticle(option);
			break;

		case 2:

			break;

		case 3:
			ArticleManager.print(Main.warehouse);

			printMainMenu();
			break;

		case 4:
			break;

		default:
			System.out.println("OPCIÓN NO VÁLIDA¡");
			printMainMenu();
			break;
		}
	}

	public static void switchManageArticle(int option) {

		switch (option) {
		case 1:

			int id = ArticleManager.returnLastID(Main.warehouse);

			System.out.println("\nESCRIBRE LA CATEGORÍA: textil, electronica o alimentacion.");
			Scanner scan = new Scanner(System.in);
			String category = scan.nextLine();
			Main.warehouse.getArticles()[id] = ArticleFactory.getArticle(category);

			System.out.println("ESCRIBRE EL NOMBRE DE ARTÍCULO:");
			scan = new Scanner(System.in);
			String name = scan.nextLine();

			System.out.println("AÑADE UNA DESCRIPCIÓN:");
			scan = new Scanner(System.in);
			String description = scan.nextLine();

			System.out.println("AÑADE EL PRECIO:");
			scan = new Scanner(System.in);
			double prize = scan.nextDouble();

			System.out.println("AÑADE EL STOCK:");
			scan = new Scanner(System.in);
			int stock = scan.nextInt();

			if (Main.warehouse.getArticles()[id] instanceof Textile) {

				System.out.println("AÑADE UN COLOR:");
				scan = new Scanner(System.in);
				String color = scan.nextLine();

				System.out.println("AÑADE UN TAMAÑO:");
				scan = new Scanner(System.in);
				String size = scan.nextLine();

				((Textile) Main.warehouse.getArticles()[id]).setColor(color);
				((Textile) Main.warehouse.getArticles()[id]).setSize(size);

			}

			if (Main.warehouse.getArticles()[id] instanceof Electronics) {

				System.out.println("AÑADE EL VOLTAJE:");
				scan = new Scanner(System.in);
				String power = scan.nextLine();

				System.out.println("AÑADE TIEMPO DE GARANTÍA:");
				scan = new Scanner(System.in);
				Double guarantee = scan.nextDouble();
				
				((Electronics) Main.warehouse.getArticles()[id]).setPower(power);
				((Electronics) Main.warehouse.getArticles()[id]).setGuarantee(guarantee);

			}

			if (Main.warehouse.getArticles()[id] instanceof Food) {

				System.out.println("AÑADE UN FECHA DE CADUCIDAD:");
				scan = new Scanner(System.in);
				String expiration = scan.nextLine();

				System.out.println("AÑADE LOS ALEGERNOS:");
				scan = new Scanner(System.in);
				String allergen = scan.nextLine();
				
				((Food) Main.warehouse.getArticles()[id]).setExpirationDate(expiration);
				((Food) Main.warehouse.getArticles()[id]).setAllergens(allergen);

			}

			 ArticleManager.addArticleTextile(id, name, description, prize, stock);
			 System.out.println("!ARTÍCULO "+name+" AÑADIDO CORRECTAMENTE¡");
			 printMainMenu();
			break;

		case 2:

			break;

		default:
			System.out.println("OPCIÓN NO VÁLIDA¡");
			switchInitialMenu(1);
			break;
		}
	}

}
