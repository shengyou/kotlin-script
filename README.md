# 用 Kotlin 做自動化工具

雖然 Kotlin 的主流用法都是拿來寫手機、伺服器或是桌面應用程式，但其實 Kotlin 也具備 Scripting Language 的特點，可以在 Terminal 底下隨寫即跑，執行各種任務。在這場分享裡，將會介紹 Kotlin Script 這種特別的執行模式，示範如何把 Kotlin 當成 Scripting Language 用，並結合 kscript，依照不同情境需求撰寫自動化程式，最後再介紹幾個延伸應用的開放原始碼專案，展現把 Kotlin 當成強型別 Bash 的潛力。

## 相關資源

* 簡報檔：https://www.slideshare.net/shengyou/kotlin-script-as-automation-tools/
* 原始碼：https://github.com/shengyou/kotlin-script

### 警告！

#### 這個範例程式碼僅是配合投影片上的展示而撰寫，範例內為配合概念演示，程式碼並非最佳實踐、程式內的諸多功能、錯誤處理也不完整，目的僅是做為概念驗證。請勿將這個程式碼佈署至上線機器，若因此造成您的損失恕不負責。
