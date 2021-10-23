package ClassRelationships;

/**
 *
 * @author Fitri Fauziyah
 */
public class StatusMhs {
    private String status;
    private int tahunDibterlakukan;
    
    public StatusMhs(String status, int tahunDibterlakukan) {
        this.status = status;
        this.tahunDibterlakukan = tahunDibterlakukan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTahunDibterlakukan() {
        return tahunDibterlakukan;
    }

    public void setTahunDibterlakukan(int tahunDibterlakukan) {
        this.tahunDibterlakukan = tahunDibterlakukan;
    }
}
