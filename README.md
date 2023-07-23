# Design Pattern

## Uses
- Build: Java 17 by [Amazon Corretto](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
- Quality Scan: [SonarCloud](https://sonarcloud.io/)

## Doc (Vietnamese)
- [Design Pattern Wiki](https://github.com/DuckWithNoSound/DesignPattern/wiki)

## Reference Source
- [Refactoring.guru](https://refactoring.guru/design-patterns/)

## Creational
### I. [Singleton Design Pattern](https://github.com/DuckWithNoSound/DesignPattern/wiki/Doc:-Singleton-Design-Pattern)
1. ***Singleton Design Pattern được sử dụng khi bạn muốn đảm bảo rằng một lớp chỉ có duy nhất một thể hiện và cung cấp một cách để truy cập đến thể hiện này từ bất kỳ đâu trong ứng dụng.*** Các trường hợp thường gặp khi cần sử dụng Singleton Design Pattern bao gồm:
- **Truy cập chung đến một tài nguyên chia sẻ**: Khi bạn muốn chia sẻ một tài nguyên duy nhất trong toàn bộ ứng dụng, bạn có thể sử dụng Singleton để đảm bảo rằng chỉ có một thể hiện của lớp quản lý tài nguyên đó.
- **Truy cập đến cấu hình**: Khi bạn muốn lưu trữ các cấu hình ứng dụng và truy cập chúng từ bất kỳ đâu trong ứng dụng, Singleton Design Pattern có thể hữu ích để lưu trữ và quản lý cấu hình này.
- **Ghi nhớ trạng thái của ứng dụng**: Khi bạn muốn lưu trữ trạng thái của ứng dụng và truy cập nó từ các thành phần khác nhau của ứng dụng, Singleton Design Pattern có thể giúp bạn thực hiện điều này một cách hiệu quả.
- **Truy cập đến các dịch vụ hệ thống**: Khi bạn muốn truy cập đến các dịch vụ hệ thống như log, cache, hoặc database connection từ nhiều thành phần trong ứng dụng, Singleton Design Pattern có thể giúp bạn quản lý và cung cấp truy cập đến các dịch vụ này một cách chính xác.
2. ***Ưu điểm***
- **Đảm bảo tồn tại duy nhất**: Singleton đảm bảo rằng chỉ có một thể hiện duy nhất của lớp trong suốt quá trình chạy của ứng dụng. Điều này hữu ích khi bạn muốn chia sẻ một tài nguyên duy nhất hoặc quản lý trạng thái toàn cục.
- **Tiết kiệm bộ nhớ**: Vì chỉ có một thể hiện duy nhất của lớp được tạo ra, Singleton giúp tiết kiệm bộ nhớ trong trường hợp cần sử dụng lớp nhiều lần.
- **Dễ dàng truy cập**: Singleton cung cấp một cách dễ dàng để truy cập đến thể hiện duy nhất của lớp từ bất kỳ đâu trong ứng dụng, không cần tạo nhiều thể hiện và truyền chúng giữa các thành phần.
- **Tránh xung đột**: Singleton giúp tránh xung đột khi nhiều thành phần trong ứng dụng cố gắng tạo thể hiện của cùng một lớp.
- **Hỗ trợ lazy initialization**: Singleton có thể được khởi tạo một cách lười biếng (lazy initialization), tức là không cần tạo thể hiện ngay khi ứng dụng bắt đầu chạy, mà chỉ khi cần thiết.
- **Dễ dàng kiểm soát truy cập**: Singleton cung cấp một điểm truy cập duy nhất đến thể hiện của lớp, giúp kiểm soát quyền truy cập và đảm bảo rằng chỉ có những thành phần được phép truy cập vào lớp này.
- **Linh hoạt trong việc mở rộng**: Singleton có thể được mở rộng để hỗ trợ thêm tính năng hoặc chức năng mà không ảnh hưởng đến các thành phần khác trong ứng dụng.
3. ***Nhược điểm***
- **Vi phạm Single Responsibility Principle**: Singleton giải quyết hai vấn đề cùng một lúc, đảm bảo tồn tại duy nhất của lớp và quản lý trạng thái toàn cục. Điều này có thể vi phạm nguyên lý Single Responsibility, làm cho lớp trở nên quá phức tạp và khó bảo trì.
- **Khó kiểm thử**: Việc sử dụng Singleton làm cho mã khó kiểm thử vì chỉ có một thể hiện duy nhất của lớp. Trong quá trình kiểm thử, việc tạo và xóa các thể hiện của lớp có thể gây ra sự phụ thuộc và các vấn đề không mong muốn.
- **Gây rối trong quản lý trạng thái**: Singleton có thể gây rối trong việc quản lý trạng thái của ứng dụng. Khi một thể hiện duy nhất của lớp được sử dụng bởi nhiều thành phần, việc quản lý trạng thái của lớp có thể trở nên phức tạp và khó khăn.
- **Gây ra vấn đề đồng thời**: Trong môi trường đa luồng, việc sử dụng Singleton có thể gây ra các vấn đề đồng thời. Nếu không thực hiện đúng cách, có thể xảy ra xung đột khi nhiều luồng cố gắng truy cập và sửa đổi dữ liệu trong thể hiện duy nhất của lớp.
- **Khó mở rộng**: Singleton là một mẫu thiết kế tĩnh, điều này làm cho việc mở rộng và thay đổi lớp trở nên khó khăn. Khi bạn muốn thêm tính năng mới hoặc thay đổi cấu trúc của lớp, bạn cần phải thay đổi mã trong nhiều nơi, điều này có thể gây ra các vấn đề và lỗi không mong muốn.
### II. Builder Design Pattern
### III. Factory Method Design Pattern
### IV. Abstract Factory Design Pattern
### V. Prototype Design Pattern

## Structural
### I. Decorator Design Pattern
### II. Flyweight Design Pattern
### III. Proxy Design Pattern
### IV. Facade Design Pattern
### V. Composite Design Pattern
### VI. Bridge Design Pattern
### VII. Adapter Design Pattern

## Behavioral
### I. Iterator Design Pattern
### II. Observer Design Pattern
### III. Strategy Design Pattern
### IV. State Design Pattern
### V. Template Method Design Pattern
### VI. Visitor Design Pattern
### VII. Command Pattern
### VIII. Memento Design Pattern
### IX. Mediator Design Pattern
### X. Chain Of Responsibility Design Pattern


