package lv.activestudio.java2.mvcnospring;

public class MVCModel {

    private String view;
    private String data;

    public MVCModel(String view, String data) {
        this.view = view;
        this.data = data;
    }

    public MVCModel(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public String getData() {
        return data;
    }
}
