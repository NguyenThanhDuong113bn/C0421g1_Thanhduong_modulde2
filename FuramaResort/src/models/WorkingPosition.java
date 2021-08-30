package models;
//WorkingPosition :vi tri viec lam
public class WorkingPosition {
    private String receptionist;
    private String serve;
    private String speciali;
    private String supervisor;
    private String manage;
    private String  manager;

    public WorkingPosition(String receptionist, String serve, String speciali, String supervisor, String manage, String manager) {
        this.receptionist = receptionist;
        this.serve = serve;
        this.speciali = speciali;
        this.supervisor = supervisor;
        this.manage = manage;
        this.manager = manager;
    }

    public String getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(String receptionist) {
        this.receptionist = receptionist;
    }

    public String getServe() {
        return serve;
    }

    public void setServe(String serve) {
        this.serve = serve;
    }

    public String getSpeciali() {
        return speciali;
    }

    public void setSpeciali(String speciali) {
        this.speciali = speciali;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
