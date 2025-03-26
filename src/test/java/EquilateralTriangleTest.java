import edu.levytskyi.EquilateralTriangle;
import org.junit.Test;
import static org.junit.Assert.*;

public class EquilateralTriangleTest {

    // 1. Тест для calculatePerimeter() з цілим числом
    @Test
    public void testCalculatePerimeter_IntegerSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(5);
        assertEquals(15, triangle.calculatePerimeter(), 0.001);
    }

    // 2. Тест для calculatePerimeter() з дробовим числом
    @Test
    public void testCalculatePerimeter_DoubleSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(7.5);
        assertEquals(22.5, triangle.calculatePerimeter(), 0.001);
    }

    // 3. Тест для calculateArea() з цілим числом
    @Test
    public void testCalculateArea_IntegerSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(4);
        assertEquals(6.928, triangle.calculateArea(), 0.001);
    }

    // 4. Тест для calculateArea() з дробовим числом
    @Test
    public void testCalculateArea_DoubleSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(3.2);
        assertEquals(4.434, triangle.calculateArea(), 0.001);
    }

    // 5. Тест для calculateHeight() з цілим числом
    @Test
    public void testCalculateHeight_IntegerSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(6);
        assertEquals(5.196, triangle.calculateHeight(), 0.001);
    }

    // 6. Тест для calculateHeight() з дробовим числом
    @Test
    public void testCalculateHeight_DoubleSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(4.8);
        assertEquals(4.157, triangle.calculateHeight(), 0.001);
    }

    // 7. Тест для calculateInradius() з цілим числом
    @Test
    public void testCalculateInradius_IntegerSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(7);
        assertEquals(2.0207, triangle.calculateInradius(), 0.001);
    }

    // 8. Тест для calculateInradius() з дробовим числом
    @Test
    public void testCalculateInradius_DoubleSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(5.3);
        assertEquals(1.52998, triangle.calculateInradius(), 0.001);
    }

    // 9. Тест для calculateCircumradius() з цілим числом
    @Test
    public void testCalculateCircumradius_IntegerSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(8);
        assertEquals(4.6188, triangle.calculateCircumradius(), 0.001);
    }

    // 10. Тест для calculateCircumradius() з дробовим числом
    @Test
    public void testCalculateCircumradius_DoubleSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(6.1);
        assertEquals(3.521, triangle.calculateCircumradius(), 0.001);
    }

    // 11. Тест для isLarge() - трикутник великий
    @Test
    public void testIsLarge_True() {
        EquilateralTriangle largeTriangle = new EquilateralTriangle(15);
        assertTrue(largeTriangle.isLarge());
    }

    // 12. Тест для isLarge() - трикутник невеликий
    @Test
    public void testIsLarge_False() {
        EquilateralTriangle smallTriangle = new EquilateralTriangle(5);
        assertFalse(smallTriangle.isLarge());
    }

    // 13. Тест для compareArea() - перший трикутник менший
    @Test
    public void testCompareArea_FirstSmaller() {
        EquilateralTriangle triangle1 = new EquilateralTriangle(5);
        EquilateralTriangle triangle2 = new EquilateralTriangle(10);
        assertTrue(triangle1.compareArea(triangle2) < 0);
    }

    // 14. Тест для compareArea() - перший трикутник більший
    @Test
    public void testCompareArea_FirstLarger() {
        EquilateralTriangle triangle1 = new EquilateralTriangle(10);
        EquilateralTriangle triangle2 = new EquilateralTriangle(5);
        assertTrue(triangle1.compareArea(triangle2) > 0);
    }

    // 15. Тест для compareArea() - трикутники рівні за площею
    @Test
    public void testCompareArea_EqualArea() {
        EquilateralTriangle triangle1 = new EquilateralTriangle(5);
        EquilateralTriangle triangle2 = new EquilateralTriangle(5);
        assertEquals(0, triangle1.compareArea(triangle2));
    }

    // 16. Тест для scale() - масштабування вдвічі
    @Test
    public void testScale_DoubleFactor() {
        EquilateralTriangle triangle = new EquilateralTriangle(5);
        triangle.scale(2);
        assertEquals(10, triangle.getSide(), 0.001);
    }

    // 17. Тест для scale() - масштабування в 0.5 (зменшення)
    @Test
    public void testScale_HalfFactor() {
        EquilateralTriangle triangle = new EquilateralTriangle(10);
        triangle.scale(0.5);
        assertEquals(5, triangle.getSide(), 0.001);
    }

    // 18. Тест для конструктора з від'ємною стороною - очікується виняток
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NegativeSide() {
        new EquilateralTriangle(-5);
    }

    // 19. Тест для setSide() з від'ємним значенням - очікується виняток
    @Test(expected = IllegalArgumentException.class)
    public void testSetSide_NegativeSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(5);
        triangle.setSide(-1);
    }

    // 20. Тест для scale() з від'ємним фактором - очікується виняток
    @Test(expected = IllegalArgumentException.class)
    public void testScale_NegativeFactor() {
        EquilateralTriangle triangle = new EquilateralTriangle(5);
        triangle.scale(-1);
    }

    // 21. Тест для scale() з нульовим фактором - очікується виняток
    @Test(expected = IllegalArgumentException.class)
    public void testScale_ZeroFactor() {
        EquilateralTriangle triangle = new EquilateralTriangle(5);
        triangle.scale(0);
    }

    // 22. Тест для getSide() - перевірка отримання значення сторони
    @Test
    public void testGetSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(12.3);
        assertEquals(12.3, triangle.getSide(), 0.001);
    }

    // 23. Тест для setSide() - встановлення нового позитивного значення сторони
    @Test
    public void testSetSide_PositiveValue() {
        EquilateralTriangle triangle = new EquilateralTriangle(5);
        triangle.setSide(9);
        assertEquals(9, triangle.getSide(), 0.001);
    }

    // 24. Комбінований тест: scale() потім calculateArea()
    @Test
    public void testScaleAndCalculateArea() {
        EquilateralTriangle triangle = new EquilateralTriangle(2);
        triangle.scale(3); // Сторона стає 6
        assertEquals(15.588, triangle.calculateArea(), 0.001); // Площа для сторони 6
    }

    // 25. Тест з великим значенням сторони (перевірка на великі числа)
    @Test
    public void testCalculateArea_LargeSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(1000);
        assertEquals(433012.701, triangle.calculateArea(), 0.001);
    }

    // 26. Тест з дуже малим значенням сторони (перевірка на точність)
    @Test
    public void testCalculateArea_SmallSide() {
        EquilateralTriangle triangle = new EquilateralTriangle(0.001);
        assertEquals(0.000000433, triangle.calculateArea(), 1e-9); // Зменшена точність delta для малих чисел
    }
}