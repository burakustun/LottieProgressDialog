# LottieProgressDialog
Progress dialog which uses Lottie library for animations

## Examples

![example1](http://xn--burakstn-b6ac.com.tr/images/example1.gif)
![example2](http://xn--burakstn-b6ac.com.tr/images/example2.gif)
![example3](http://xn--burakstn-b6ac.com.tr/images/example3.gif)
![example4](http://xn--burakstn-b6ac.com.tr/images/example4.gif)
![example5](http://xn--burakstn-b6ac.com.tr/images/example5.gif)
![example6](http://xn--burakstn-b6ac.com.tr/images/example6.gif)

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

1- Find a lottie animation (you can use http://lottiefiles.com) or create a new one

2- Create assets directory in **src/main/**

3- Put your json file of animation in **src/main/assets**

4- Create a dialog

Cancelable looping animation dialog:

```java
        //confetti.json is file name of animation
        DialogFragment dialogFragment = new LottieDialogFragment().newInstance("confetti.json"); 
        dialogFragment.show(getFragmentManager(),"tag");
```

![animation gif](http://xn--burakstn-b6ac.com.tr/images/confetti.gif "Cancelable dialog with confetti animation") 

Non-cancelable non-looping animation dialog:
```java
  final DialogFragment lottieDialog = new LottieDialogFragment().newInstance("trophy.json",false);
                lottieDialog.setCancelable(false);
                lottieDialog.show(fragmentManager,"lottieDialog2");

                //DISMISS AFTER 5 SEC
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        lottieDialog.dismiss();
                    }
                },5000);

```

![animation gif](http://xn--burakstn-b6ac.com.tr/images/trophy.gif "Non-cancelable dialog with trophy animation") 

## Useful Links

Lottie documentation : http://airbnb.io/lottie/

You can find lots of animations in https://www.lottiefiles.com
