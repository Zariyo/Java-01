
import java.lang.Math;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class OdcinekTest {
    @Test
    public void testGetCoord(){
        // Arrange
        // sut = System Under Test
        Odcinek sut = new Odcinek(10, 10, 20, 20);
        // Act
        sut.getCoordsx1();
        // Assert
        assertEquals("x.getCoords()", 10, sut.getCoordsx1(), 0.00001);
    }
    @Test
    public void testShift(){
        // Arrange
        // sut = System Under Test
        Odcinek sut = new Odcinek(10, 10, 20, 20);
        // Act
        sut.shift(5,5);
        // Assert
        assertEquals("x.getCoords()", 15, sut.getCoordsx1(), 0.00001);
    }
    @Test
    public void testDistance(){
        // Arrange
        // sut = System Under Test
        Odcinek sut = new Odcinek(10, 10, 20, 20);
        // Act
        // Assert
        assertEquals("x.getCoords()", 7.07, sut.distance(new Punkt(5, 5)), 0.01);
    }



}
