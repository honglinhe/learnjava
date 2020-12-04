# LocalDate、LocalTime、LocalDateTime的使用技巧
### now():获取当前 日期 时间 日期加时间

```
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
```
### of（）:设置指定的年、月、日、时、分秒。没有偏移量

```
        LocalDateTime.of(2020,12,12,22,11);
```
### getXxx():获取相关的属性
```  System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());
```
### withXxx（）：设置相关的的属性

```    
    LocalDate localDate1 = localDate.withDayOfMonth(10);
```
### plusXxx()与minusXxx():加减相关的属性

```
        LocalDateTime localDateTime1 = localDateTime.plusDays(2);
        LocalDateTime localDateTime2 = localDateTime.minusHours(2);
```

# Instant
### now()获取的是本初子午线对应的标准时间

```
Instant instant = Instant.now();
```
### 添加时间的偏移量
```
instant.atOffset(ZoneOffset.ofHours(8));
```
### toEpochMilli（）:荻取自1970年1月1日0吋0分0秒（UTC）幵始的毫秒数

```
long l = instant.toEpochMilli();
```
### ofEpochMilli（）:通过给定的毫秒数，获取Instant实例

```
Instant instant1 = Instant.ofEpochMilli(l);
```
# DateTimeFormatter: 格式化或解析日期、时间
### 方式一：预定义的标准格式。如: ISO_LOCAL_DATE_TIME；ISO_LOCAL_DATE；ISO_LOCAL_TIME

```
        //格式化：日期->字符串
        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();
        String s = isoDateTime.format(now);
        //解析：字符串->日期
        TemporalAccessor parse = isoDateTime.parse(s);
```
### 方式二：本地化相关的格式。如: ofLocalizedDateTime（FormatStyle. LONG）

```
DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
```
### 方式三自定义的格式。如: ofPattern（"yyyy一MM一dd hh:mm:ss E"）

```
DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
```
# 不常用的关于时间的类
* **Zoneld**:该类中包含了所有的时区信息，一个时区的ID，如Europe/Paris
* **ZonedDateTime**:一个在IS0一8601日历系统时区的日期时间，如2007一12一03T10:15:30+01:00 Europe/Paris。
➢ 其中每个时区都对应着ID，地区ID都为“{区域}/{城市}”的格式，例如:Asia/Shanghai等
* **Clock**:使用时区提供对当前即时、日期和时间的访问的时钟。
* 持续时间: **Duration**， 用于计算两个“时间”间隔
* 日期间隔: **Period**， 用于计算两个“日期”间隔
* **TemporalAdjuster** :时间校正器。有时我们可能需要获取例如:将日期调整到“下一个工作日”等操作。
* **TemporalAdjusters **:该类通过静态方法
（firstDayOfXxx（）/lastDayOfXxx（）/nextXxx（））提供了大量的常用
TemporalAdjuster的实现。