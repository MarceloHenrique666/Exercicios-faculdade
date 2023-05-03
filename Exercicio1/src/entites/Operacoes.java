package entites;

public class Operacoes {

		public double width; //largura
		public double height; //altura
	
		
		
		public Double Area(double width, double height) {
						
			double area = width * height;
			return area;
			
		}
		
		public Double Perimetro(double width, double height) {
			
			double perimetro = (width + height) * 2;
			return perimetro;
			
		}
		
		public Double Diagonal (double width, double height) {
			
			double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
			return diagonal;
			
		}
	
}
