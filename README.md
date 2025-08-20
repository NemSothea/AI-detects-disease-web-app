# AI-Powered Crop Disease Detection Web App

## 🌱 Overview

**Smart Crop Disease Detector** is an innovative web application designed to help farmers quickly identify plant diseases through AI-powered image analysis. By uploading photos of their crops, farmers receive instant disease diagnoses along with prevention and treatment recommendations, enabling early intervention to reduce crop loss.

## ✨ Key Features

- **AI-Powered Disease Detection**: Upload plant photos for instant disease analysis
- **User-Friendly Interface**: Simple, intuitive design optimized for farmers
- **Historical Records**: Track previous diagnoses and results
- **Educational Resources**: Access prevention and treatment information
- **Multi-Device Compatibility**: Works on smartphones, tablets, and computers

## ✨ Technology Stack

| Component | Technology |
|-----------|------------|
| **Backend** | Java with Spring Boot |
| **Frontend** | HTML5, CSS3, JavaScript, Bootstrap, Thymeleaf |
| **AI/ML** | TensorFlow/Keras (pre-trained models) |
| **Database** | PostgreSQL |
| **Deployment** | To be determined |

## 🗂️ Project Structure

```
plant-disease-detector/
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/
│   │   │   └── 📁 com/
│   │   │       └── 📁 example/
│   │   │           ├── 📁 controller/          # 🎮 Spring Controllers
│   │   │           │   └── DiseaseController.java
│   │   │           ├── 📁 service/             # ⚙️ Business Services
│   │   │           │   └── DiseaseService.java
│   │   │           └── PlantDiseaseDetectorApplication.java  # 🚀 Main App
│   │   └── 📁 resources/
│   │       ├── 📁 static/                     # 🎨 Static Assets
│   │       │   ├── 📁 css/
│   │       │   ├── 📁 js/
│   │       │   └── 📁 uploads/                # 📸 Image Storage
│   │       ├── 📁 templates/                  # 📄 Thymeleaf Views
│   │       │   └── result.html
│   │       └── application.properties         # ⚙️ Configuration
├── 📁 lib/                                    # 📦 External Libraries
└── pom.xml                                    # 📋 Maven Dependencies
```
## 🗃️ Database Design

### Users Table
| Column | Type | Description |
|--------|------|-------------|
| id | SERIAL PRIMARY KEY | Unique user identifier |
| name | VARCHAR(100) | User's full name |
| email | VARCHAR(150) | User's email address |
| phone | VARCHAR(20) | Contact number |
| created_at | TIMESTAMP | Account creation date |

### Uploads Table
| Column | Type | Description |
|--------|------|-------------|
| id | SERIAL PRIMARY KEY | Unique upload identifier |
| user_id | INTEGER FOREIGN KEY | References Users(id) |
| image_path | VARCHAR(255) | Path to stored image |
| disease_result | VARCHAR(100) | AI-detected disease |
| confidence_score | DECIMAL(5,4) | AI confidence level |
| timestamp | TIMESTAMP | Upload time |
| treatment_advice | TEXT | Recommended actions |

## 📋 Implementation Plan

### Phase 1: Foundation (Week 1-2)
- Set up development environment
- Create Spring Boot project structure
- Design and implement database schema
- Develop basic CRUD operations

### Phase 2: Core Functionality (Week 3-4)
- Implement image upload functionality
- Integrate AI model (pre-trained PlantVillage dataset)
- Create results display interface
- Develop user history page

### Phase 3: Enhancement (Week 5-6)
- Implement user authentication
- Add responsive design for mobile devices
- Create disease knowledge base
- Performance optimization

### Phase 4: Testing & Deployment (Week 7-8)
- Comprehensive testing (unit, integration, UI)
- User acceptance testing with target farmers
- Deployment to production environment
- Documentation finalization

## 👥 Team Structure

| Member | Role | Responsibilities |
|--------|------|------------------|
| **Sothea** | Backend Developer | Spring Boot implementation, API development |
| **Pisey** | Frontend Developer | UI/UX design, Thymeleaf integration |
| **Seyha** | AI Integration Specialist | TensorFlow model integration, image processing |
| **Srey Nich** | Database Administrator | PostgreSQL management, data architecture |
| **All Members** | Documentation | Collaborative documentation efforts |

## 🚀 Getting Started

### Prerequisites
- Java JDK 11 or higher
- Maven 3.6+
- PostgreSQL 12+
- Python 3.8+ (for AI components)
- TensorFlow 2.0+

### Installation
1. Clone the repository:
`git clone [https://github.com/NemSothea/AI-detects-disease-web-app]`

2. Navigate to project directory:

3. Configure database connection in `application.properties`

4. Build the project:
mvn clean install

5. Run the application:
mvn spring-boot:run

6. Access the application at `http://localhost:8081`

## 📊 AI Model Details

The application uses a convolutional neural network (CNN) trained on the PlantVillage dataset, which contains over 50,000 images of healthy and diseased plants. The model supports detection for multiple crops including:

- Rice
- Cassava
- Tomatoes
- Potatoes
- Corn

Current accuracy: ~95% on test data for supported crop types.

## 🌍 Impact & Benefits

- **Early Detection**: Identify diseases before they spread extensively
- **Reduced Crop Loss**: Timely interventions can save up to 80% of affected crops
- **Knowledge Empowerment**: Farmers learn to recognize and treat common diseases
- **Cost Effective**: Free alternative to expensive agricultural consultancy

## 📈 Future Enhancements

- Mobile application version
- Multilingual support (Khmer, English)
- Integration with agricultural extension services
- Real-time alerts for disease outbreaks in regions
- Community forum for farmer discussions
- Seasonal disease prediction features

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🤝 Contributing

We welcome contributions from the community. Please read our contributing guidelines before submitting pull requests.

## 📞 Support

For support or questions, please contact our team or create an issue in the GitHub repository.

---

*Empowering farmers through technology for sustainable agriculture* 🌱💻
