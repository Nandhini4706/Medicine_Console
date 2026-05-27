package Model;

public class Medicine {
    public int medicineId;
    public String medicineName;
    public String medicineDescription;
    public String purpose;
    public String ageRange;

    public Medicine(int medicineId,String medicineName,String medicineDescription,String purpose,String ageRange){
        this.medicineId=medicineId;
        this.medicineName=medicineName;
        this.medicineDescription=medicineDescription;
        this.purpose=purpose;
        this.ageRange=ageRange;
    }
}
