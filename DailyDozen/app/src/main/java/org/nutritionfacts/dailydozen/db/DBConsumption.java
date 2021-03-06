package org.nutritionfacts.dailydozen.db;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
import org.nutritionfacts.dailydozen.food.FoodType;
// KEEP INCLUDES END
/**
 * Entity mapped to table DBCONSUMPTION.
 */
public class DBConsumption {

    private Long id;
    private Double consumedServingCount;
    private String foodTypeIdentifier;
    private Long dailyReportId;

    // KEEP FIELDS - put your custom fields here
    public FoodType foodType;
    // KEEP FIELDS END

    public DBConsumption() {
    }

    public DBConsumption(Long id) {
        this.id = id;
    }

    public DBConsumption(Long id, Double consumedServingCount, String foodTypeIdentifier, Long dailyReportId) {
        this.id = id;
        this.consumedServingCount = consumedServingCount;
        this.foodTypeIdentifier = foodTypeIdentifier;
        this.dailyReportId = dailyReportId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getConsumedServingCount() {
        return consumedServingCount;
    }

    public void setConsumedServingCount(Double consumedServingCount) {
        this.consumedServingCount = consumedServingCount;
    }

    public String getFoodTypeIdentifier() {
        return foodTypeIdentifier;
    }

    public void setFoodTypeIdentifier(String foodTypeIdentifier) {
        this.foodTypeIdentifier = foodTypeIdentifier;
    }

    public Long getDailyReportId() {
        return dailyReportId;
    }

    public void setDailyReportId(Long dailyReportId) {
        this.dailyReportId = dailyReportId;
    }

    // KEEP METHODS - put your custom methods here

    public static DBConsumption getConsumption(DaoSession session, long id) {

        return session
                .getDBConsumptionDao()
                .queryBuilder()
                .where(DBConsumptionDao.Properties.Id.eq(id)).unique();
    }
    // KEEP METHODS END

}
