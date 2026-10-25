# 🌤️ Weather App

A modern Android Weather Application that provides real-time weather information using a weather API. The app allows users to search locations and view current weather conditions with a clean and user-friendly interface.

---

## 📱 App Preview

<p align="center">
  <img src="screenshots/home.png" width="250"/>
  <img src="screenshots/search.png" width="250"/>
</p>

---

## ✨ Features

✅ Search weather by city name  
✅ Get real-time weather information  
✅ Display current temperature  
✅ Show weather conditions (Sunny, Cloudy, Rain, etc.)  
✅ Display humidity information  
✅ Display wind speed  
✅ Responsive and clean UI  
✅ API-based live weather updates  
✅ Error handling for invalid locations  

---

## 🛠️ Technologies Used

### Android Development
- **Kotlin**
- **Android Studio**
- **Jetpack Components**
- **Material Design**

### Networking
- **Retrofit** - API communication
- **Gson Converter** - JSON parsing

### Architecture
- MVVM Architecture
- Repository Pattern
- ViewModel
- LiveData / StateFlow

### API
- Weather API integration

---

## 🏗️ Project Structure
WeatherApp
│
├── app
│   ├── data
│   │   ├── api
│   │   ├── model
│   │   └── repository
│   │
│   ├── ui
│   │   ├── screens
│   │   ├── components
│   │   └── theme
│   │
│   ├── viewmodel
│   │
│   └── MainActivity.kt
│
├── gradle
│
├── build.gradle.kts
│
└── settings.gradle.kts
