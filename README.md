# bootstrap.alert
android toast like bootstrap alert

## implementation

```bash
allprojects {
    repositories {
        ......
        maven { url 'https://jitpack.io' }
    }
}
```
```bash
implementation 'com.github.alnazer:bootstrap.alert:1.0.0'
```

## Usage

```java
import com.alnazer.bootstrap.alert.Alert;

Alert.primary(getBaseContext(),"header text","Message text here");

Alert.secondary(getBaseContext(),"header text","Message text here");

Alert.success(getBaseContext(),"header text","Message text here");

Alert.danger(getBaseContext(),"header text","Message text here");

Alert.warning(getBaseContext(),"header text","Message text here");

Alert.info(getBaseContext(),"header text","Message text here");

Alert.light(getBaseContext(),"header text","Message text here");

Alert.dark(getBaseContext(),"header text","Message text here");
```
## Ui
### primary
![primary](https://github.com/alnazer/bootstrap.alert/blob/master/images/primary.png)

### success
![success](https://github.com/alnazer/bootstrap.alert/blob/master/images/success.png)

### danger
![danger](https://github.com/alnazer/bootstrap.alert/blob/master/images/danger.png)

### warning
![warning](https://github.com/alnazer/bootstrap.alert/blob/master/images/warning.png)

### info
![info](https://github.com/alnazer/bootstrap.alert/blob/master/images/info.png)

### dark
![dark](https://github.com/alnazer/bootstrap.alert/blob/master/images/dark.png)

### light
![light](https://github.com/alnazer/bootstrap.alert/blob/master/images/light.png)

### secondary
![secondary](https://github.com/alnazer/bootstrap.alert/blob/master/images/secoundry.png)

## License
[MIT](https://choosealicense.com/licenses/mit/)
