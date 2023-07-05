package com.lotto.domain.request;

public class WinningNumberRequest {
    private int drawDate;
    private String lottoNumber;

    public WinningNumberRequest(int drawDate, String lottoNumber) {
        this.drawDate = drawDate;
        this.lottoNumber = lottoNumber;
    }

    public int getDrawDate() {
        return drawDate;
    }

    public void setDrawDate(int drawDate) {
        this.drawDate = drawDate;
    }

    public String getLottoNumber() {
        return lottoNumber;
    }

    public void setLottoNumber(String lottoNumber) {
        this.lottoNumber = lottoNumber;
    }
    public String[] getLottoNumbers() {
        return lottoNumber.split(",");
    }
}


