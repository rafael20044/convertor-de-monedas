package com.convertor.modelos;

public class Respuesta {
    private String result;
    private String documentation;
    private String terms_of_use;
    private int time_last_update_unix;
    private String time_last_update_utc;
    private int time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private String target_code;
    private float conversion_rate;

    public Respuesta() {
    }

    public float getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(float conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

}
