import java.util.ArrayList;
import java.util.List;

public class Repository {

    List<Product> listProducts = new ArrayList<>();

    public Repository() {
        listProducts.add(new Product("01", "Bánh Doraemon 3 vị", Category.FOOD, 100, 3500, 57));
        listProducts.add(new Product("02", "Xúc xích sườn non" , Category.FOOD, 150, 3500, 12));
        listProducts.add(new Product("03", "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProducts.add(new Product("04", "Bánh khoai môn", Category.FOOD, 200, 42000, 78));
        listProducts.add(new Product("05", "Thìa ăn cơm inox mạ vàng", Category.HOUSEWARE, 50, 8000, 4));
        listProducts.add(new Product("06", "Bát đựng gia vị", Category.HOUSEWARE, 65, 4000, 44));
        listProducts.add(new Product("07", "Nước Hoa Hồng Soothing Facial Toner Simple", Category.COSMETICS, 140, 92000, 88));
        listProducts.add(new Product("08", "Combo gội xả HAIRBURST", Category.COSMETICS, 100, 639000, 7));
        listProducts.add(new Product("09", "Tinh chất dưỡng ẩm sâu Klairs Rich Moist Soothing Serum", Category.COSMETICS, 50, 249000, 24));
        listProducts.add(new Product("10", "Kem dưỡng thể Paula’s Choice RESIST WEIGHTLESS BODY TREATMENT", Category.COSMETICS, 80, 715000, 63));
        listProducts.add(new Product("11", "Áo thun TSUN", Category.FASHION, 250, 320000, 146));
    }

    public void show(){
        for (Product product : listProducts) {
            System.out.println(product);
        }
    }

    
    
}
