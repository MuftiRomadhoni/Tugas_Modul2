import java.util.ArrayList;

public class Tugas_Modul2 {

    public static void main(String[] args) {
        ArrayList<String> Hewan= new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        //add
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        // isi arraylist hewan
        System.out.println("Hewan : " + Hewan);

        //delete
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        for (int i = 0; i < DeleteHewan.size(); i++)
        {
            Hewan.remove(DeleteHewan.get(i));
        }
        //output
        System.out.println("Hewan Yang Dihapus : " + DeleteHewan);
        System.out.println("Output Hewan : " + Hewan);
    }
}

