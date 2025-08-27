// swift-tools-version:5.5
import PackageDescription

let package = Package(
    name: "MAX",
    platforms: [.iOS(.v14)],
    products: [
        .library(name: "MAX", targets: ["MAX"])
    ],
    dependencies: [
        .package(url: "https://github.com/Alamofire/Alamofire.git", from: "5.0.0")
    ],
    targets: [
        .target(
            name: "MAX",
            dependencies: ["Alamofire"]
        )
    ]
)