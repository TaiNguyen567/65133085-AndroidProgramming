package gk1.nguyenthanhtai;

import java.util.List;


public class Question {
    private String cauHoi;
    private List<String> cacLuaChon;
    private int dapAnDung;

    public Question(String cauHoi, List<String> cacLuaChon, int dapAnDung) {
        this.cauHoi = cauHoi;
        this.cacLuaChon = cacLuaChon;
        this.dapAnDung = dapAnDung;
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public List<String> getCacLuaChon() {
        return cacLuaChon;
    }

    public int getDapAnDung() {
        return dapAnDung;
    }
}