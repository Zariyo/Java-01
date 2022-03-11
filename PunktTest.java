
import java.lang.Math;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class PunktTest {
    @Test
    public void testSetPositiveCoord(){
        // Arrange
        // sut = System Under Test
        Punkt sut = new Punkt(-10, -20);
        // Act
        sut.setX(-20);
        // Assert
        assertEquals("x.setX(-20)", 20.0, sut.getX(), 0.00001);
    }

    @Test
    public void testShiftPoint(){
        // Arrange
        // sut = System Under Test
        Punkt sut = new Punkt(0, 0);
        // Act
        sut.shift(-20, 10);
        // Assert
        assertEquals("x.shift(-20, 10)", -20.0, sut.getX(), 0.00001);
        assertEquals("x.shift(-20, 10)", 10.0, sut.getY(), 0.00001);
    }

    @Test
    public void testDistanceCalc(){
        // Arrange
        // sut = System Under Test
        Punkt sut = new Punkt(0, 0);
        Punkt testPoint = new Punkt(10, 10);
        // Act
        sut.distance(testPoint);
        // Assert
        assertEquals("sut.distance(testPoint)", 10*Math.sqrt(2), sut.distance(testPoint), 0.00001);
    }

}
