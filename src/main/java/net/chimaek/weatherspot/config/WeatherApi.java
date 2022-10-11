package net.chimaek.weatherspot.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherApi {

    private final WeatherKey weatherKey;

    private final String ROOT_URL = "http://apis.data.go" +
            ".kr/1360000/TourStnInfoService"; // 루트
    private final String VILAGE = "/getTourStnVilageFcst"; // 동네예보
    private final String INDICES = "/getTourStnWthrIdx"; // 기상지수예보
    private final String PLACE = "/getCityTourClmIdx"; // 시군구별 관광기후지수

    @Autowired
    public WeatherApi(WeatherKey weatherKey) {
        this.weatherKey = weatherKey;
    }


}
