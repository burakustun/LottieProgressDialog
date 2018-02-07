# LottieProgressDialog
Progress dialog which uses Lottie library for animations

## Download

Download via Gradle:

```
implementation 'com.burakustun:lottieprogressdialog:1.0.2'
```

or Maven:

```
<dependency>
  <groupId>com.burakustun</groupId>
  <artifactId>lottieprogressdialog</artifactId>
  <version>1.0.2</version>
  <type>pom</type>
</dependency>
```

## Usage

1- Find a lottie animation or create a new one

2- Create assets directory in **src/main/**

3- Put your json file of animation in **src/main/assets**

4- Create a dialog using:

```java
        //confetti.json is file name of animation
        DialogFragment dialogFragment = new LottieDialogFragment().newInstance("confetti.json"); 
        dialogFragment.setCancelable(false);
        dialogFragment.show(getFragmentManager(),"tag");
```

## Useful Links

Lottie documentation : http://airbnb.io/lottie/

You can find lots of animations in https://www.lottiefiles.com
