enginedx
========

Simple libGDX based Framework

### Including the engine with Intellij / Android Studio

* Clone the repo

`git clone git@github.com:danmarcab/enginedx.git`

* Create your project with gdx-setup and open it

* Import the module
    * `File->Import Module`
    * Select the directory where you cloned the repo

* Add the dependencies in your build.gradle

```gradle
project(":core") {
    ...
    dependencies {
        compile project(":enginedx")
        ...
    }
}
project(":enginedx") {
    apply plugin: "java"

    dependencies {
        compile "com.badlogicgames.gdx:gdx:$gdxVersion"
    }
}
```

* Extend your game from GameDX class

```java
import com.engine.dx.GameDX;

public class MyGame extends GameDX {
}
```