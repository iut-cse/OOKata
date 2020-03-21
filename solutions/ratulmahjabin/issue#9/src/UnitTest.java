import org.junit.jupiter.api.Test;

public class UnitTest {


    @Test
    void testAll()
    {
        Toy bulk = new Bulk(10, "Green", "hammer");
        Dogverine dogverine = new Dogverine(15, "Ash", "knives");
        WhiteShadow whiteShadow = new WhiteShadow(20,"white", "Gun");

        bulk.entertain();
        dogverine.entertain();
        whiteShadow.entertain();

        System.out.println(bulk.getWeapon());



    }
}
