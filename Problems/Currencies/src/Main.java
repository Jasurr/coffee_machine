enum Currency {
    USD(840, "United States dollar"),
    EUR(978, "Euro"),
    GBP(826, "Pound sterling"),
    RUB(643, "Russian ruble"),
    UAH(980, "Ukrainian hryvnia"),
    KZT(398, "Kazakhstani tenge"),
    CAD(124, "Canadian dollar"),
    JPY(392, "Japanese yen"),
    CNY(156, "Chinese yuan");

    private final int code;
    private final String name;

    Currency(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}