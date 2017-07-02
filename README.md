# google-io-extended-2017-shortcoding

팜플렛이 떨어져서 진행하는 이벤트가 절대 아닙니다.

## 참여방법

다음 문제를 **가능한 한 코드를 짧게 Kotlin으로** 풀어서 이 Repository에 [Pull Request](https://github.com/Rainist/google-io-extended-2017-shortcoding/pulls)를 보내주시면 됩니다!

Pull Request 내용에 꼭 이메일 주소를 적어주셔야 기프티콘 발송이 가능하오니 꼭 기입해 주시면 감사하겠습니다 :D

### 문제

[Cody's Jams](https://code.google.com/codejam/contest/8274486/dashboard)

코디의 잼 가게 주인인 코디는 잼 할인 행사를 계획하고 있습니다. 간단하게 진행하기 위해, 모든 제품을 25% 할인하여 팔기로 결정했습니다. (정확하게 정가의 75% 가격) 파는 잼의 가격이 4의 배수이기 때문에, 할인된 가격 모두 **정수** 입니다.

할인 행사를 준비하기 위해 할인된 가격으로 새로운 가격표를 주문했습니다. 그리고 할인 행사가 끝났을 때 사용할 정가 가격표도 주문했습니다.

코디가 주문한 가격표를 확인했는데 불행히도, 할인된 가격, 정가가 합쳐지고, 정렬된 상태로 출력되었습니다. 심지어 가격표가 다 똑같이 생겨서 구분해 낼 수 없었습니다. 이걸 어떻게 구분해낼 수 있을까요?

예를 들어,

정가가 `20`, `80`, `100` 이었다면, 할인된 가격은 `15`, `60`, `75`이고, 가격표는 `15`, `20`, `60`, `75`, `80`, `100` 순서로 출력됩니다.

문제는 `Main.kt`의 다음 함수를 채우는 방식으로 풀어주시면 됩니다.

```kotlin
fun solve(combinedList: List<Int>): List<Int>
```

#### Sample IO
```kotlin
listOf(15, 20, 60, 75, 80, 100) to listOf(15, 60, 75),
listOf(9, 9, 12, 12, 12, 15, 16, 20) to listOf(9, 9, 12, 15),
```

## 상품

- 1등 : 스타벅스 자바칩 프라푸치노 기프티콘
- 2등 : 스타벅스 캬라멜 마끼아또 기프티콘
- 3등 : 스타벅스 아메리카노 기프티콘