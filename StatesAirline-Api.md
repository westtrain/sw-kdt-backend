## Airport API 
### **공항이름 자동완성**

클라이언트에 공항 이름을 검색할 때, 자동완성 기능이 동작해야 합니다. 이때 사용하는 API입니다.

#### **Request**

```
 GET  /airport?query={query}
```
<center>[요청] 공항이름을 검색할 때 자동완성 기능의 수행을 요구하는 HTTP 요청</center>

<br/>

이 요청은 파라미터(query parameter)를 사용해야합니다. 파라미터는 다음과 같이 사용합니다.
- `/airport?query=c`


<center>

| parameter | 형식    | 설명    | 필수 포함 여부 |
| --------- | ------ | ------ | ----------- |
| query  | 입력 문자 (문자열)  | query 값이 포함된 공항 조회 | 필수 |

\[표\] 파라미터 정보

</center>

<br/>

#### **Response**

응답은 다음과 같은 JSON 형식입니다.

```json
[
  {
      "name" : "인천'",
      "code" : "ICN"
  }
    //여러 개의 메시지
]
```
<center>[데이터] Request에 따른 Response 예시</center>

<br/>

## Flight API 

### **항공편 조회**

클라이언트에서 항공편을 조회할 때 사용하는 API입니다.

#### **Request**

```HTTP
GET /flight 
```
<center>[요청] 모든 항공편을 조회하는 HTTP 요청</center>

<br/>

파리미터가 없는 GET 요청은 저장되어 있는 모든 항공편을 조회합니다.

이 요청은 추가적인 파라미터(query parameter)를 사용할 수 있습니다. 파라미터는 다음과 같이 사용할 수 있습니다.

- `/flight?departure_times=2021-12-02T12:00:00&arrival_times=2021-12-03T12:00:00`
- `/flight?departure=ICN&destination=CJU`


<center>

| parameter       | 형식               | 설명                        | 필수 포함 여부 |
| --------------- | ------------------ | --------------------------- | -------------- |
| departure_times | 출발 시간 (문자열) | departure_times 값이 포함된 항공편 조회 | 필수 아님      |
| arrival_times   | 도착 시간 (문자열) | arrival_times 값이 포함된 항공편 조회   | 필수 아님      |
| departure       | 출발지 (문자열)    | departure 값이 포함된 항공편 조회       | 필수 아님      |
| destination     | 도착지 (문자열)    | destination 값이 포함된 항공편 조회    | 필수 아님      |

\[표\] 파라미터 정보

</center>

<br/>

#### **Response**

응답은 다음과 같은 JSON 형식입니다.

```json
[
   {
     "uuid": "af6fa55c-da65-47dd-af23-578fdba40bed"
     "departure": "ICN",
     "destination": "CJU",
     "departure_times": "2021-12-03 12:00:44",
     "arrival_times": "2021-12-03 12:00:44",
   },
   // 여러 개의 메시지
]
```
<center>[데이터] Request에 따른 Response 예시</center>

<br/>

메시지에서 사용하는 속성은 다음과 같습니다.


<center>

| parameter       | 형식   | 설명          |
| --------------- | ------ | ------------- |
| uuid            | 문자열 | 고유한 아이디 |
| departure       | 문자열 | 출발지        |
| destination     | 문자열 | 도착지        |
| departure_times | 문자열 | 출발 시간     |
| arrival_times   | 문자열 | 도착 시간     |

\[표\] 파라미터 정보


</center>

<br/>

### **uuid를 사용하는 항공편 조회**

클라이언트에서 고유 ID 값을 기준으로 항공편을 조회할 때 사용하는 API 입니다.

#### **Request**

```
 GET  /flight/{:id}
```

 요청 된 `{:id}` 값과 동일한 `uuid` 값을 가진 모든 항공편을 조회합니다. 

`{:id}` 에는 `flight.uuid`값을 넣어주세요. 아래 예시를 참고해주세요. 

```
GET  /flight/af6fa55c-da65-47dd-af23-578fdba40bed
```

#### **Response**
응답은 다음과 같은 JSON 형식입니다.

```json
   {
     "uuid": "af6fa55c-da65-47dd-af23-578fdba40bed"
     "departure": "ICN",
     "destination": "CJU",
     "departure_times": "2021-12-03 12:00:44",
     "arrival_times": "2021-12-03 12:00:44",
   }
```
<center>[데이터] Request에 따른 Response 예시</center>

<br/>

### **항공편 수정**

클라이언트에서 고유 ID 값을 기준으로 항공편을 수정할 때 사용 되는 API입니다.

#### **Request**

```
 PUT  /flight/{:id}
```
<center>[요청] 특정 항공편을 수정하는 HTTP 요청</center>

<br/>

요청에 포함된 `{:id}` 값과 동일한 `uuid` 값을 가진 항공편을 수정합니다. `{:id}` 에는 `filght.uuid`값을 넣어주세요. 다음과 같이 사용할 수 있습니다.

```
PUT  /flight/af6fa55c-da65-47dd-af23-578fdba99bed
```
<center>[요청] 특정 항공편을 수정하는 HTTP 요청 예시</center>

<br/>

PUT 요청 본문에는 다음 내용을 포함 합니다.

- 요청 형식: JSON
  - MIME 타입:  `application/json`


<center>

| parameter | 형식    | 설명    | 필수 포함 여부 |
| --------- | ------ | ------ | ----------- |
| departure  | 문자열   | 출발지 | 필수 아님 |
| destination  | 문자열   | 도착지 | 필수 아님 |
| departure_times  | 문자열   | 출발 시간 | 필수 아님 |
| arrival_times  | 문자열   | 도착 시간 | 필수 아님 |
\[표\] 파라미터 정보


</center>

<br/>

#### **Response**
응답은 다음과 같은 JSON 형식에, 변경사항이 적용된 데이터입니다.

```json
 {
    "uuid" : "af6fa55c-da65-47dd-af23-578fdba99bed",
    "departure" : "ICN",
    "destination" : "CJU",
    "departure_times" : "2021-12-02T11:00:00",
    "arrival_times" : "2021-12-04T15:00:00"
 }
```
<center>[데이터] Request에 따른 Response 예시</center>

<br/>

## **Book API** 

### **예약 조회**

클라이언트에서 예약을 조회할 때 사용하는 API입니다.

#### **Request**

``` 
 GET  /book 
```
<center>[요청] 모든 예약을 조회하는 HTTP 요청</center>

<br/>

파리미터가 없는 요청은 저장되어 있는 모든 예약을 조회합니다.

이 요청은 추가적인 파라미터(query parameter)를 사용할 수 있습니다. 파라미터는 다음과 같이 사용할 수 있습니다.

- `/book?flight_uuid=af6fa55c-da65-47dd-af23-578fdba40bed`
- `/book?phone=010-0000-0000`


<center>

| parameter | 형식    | 설명    | 필수 포함 여부 |
| --------- | ------ | ------ | ----------- |
| flight_uuid  | 항공편 고유 아이디 (문자열)   | flight_uuid 값이 포함된 예약 조회  | 필수 아님 |
| phone  | 예약자 핸드폰 번호 (문자열)   | phone 값이 포함된 예약 조회 | 필수 아님 |

\[표\] 파라미터 정보


</center>

<br/>

#### **Response  : `/book?flight_uuid=af6fa55c-da65-47dd-af23-578fdba40bed`**

flight_uuid 파라미터 요청에 응답은 다음과 같은 JSON 형식입니다.

```json
[
    {
       "flight_uuid": "af6fa55c-da65-47dd-af23-578fdba40bed",
       "name": "김코딩",
       "phone": "010-0000-0000", 
    }
   // 여러 개의 메시지
]
```
<center>[데이터] Request에 따른 Response 예시</center>

#### **Response : `/book?phone=010-0000-0000`**
phone 파라미터 요청에 응답은 다음과 같은 JSON 형식입니다.

```json
 {
    "flight_uuid": "af6fa55c-da65-47dd-af23-578fdba40bed",
    "name": "김코딩",
    "phone": "010-0000-0000", 
 }
```
<center>[데이터] Request에 따른 Response 예시</center>

<br/>

메시지에서 사용하는 속성은 다음과 같습니다.

<center>

| parameter | 형식    | 설명    |
| --------- | ------ | ------ |
| flight_uuid  | 문자열 | 예약한 항공편 고유 아이디 |
| name  | 문자열  | 예약자 이름 |
| phone  | 문자열  | 예약자 핸드폰 번호 |
\[표\] 파라미터 정보

</center>

<br/>

### **예약 생성**

클라이언트에서 예약을 생성할 때 사용하는 API입니다.

#### **Request**

```
 POST  /book
```
<center>[요청] 새로운 예약을 생성하는 HTTP 요청</center>

<br/>

요청에 함께 전달하는 JSON 데이터로 새로운 예약을 생성합니다. POST 요청 본문엔 다음 내용을 포함 합니다.

- 요청 형식: JSON
  - MIME 타입:  `application/json`

| parameter | 형식    | 설명    | 필수 포함 여부 |
| --------- | ------ | ------ | ----------- |
| flight_uuid  | 문자열   | 예약한 항공편 고유 아이디 | 필수 |
| name  | 문자열   | 예약자 이름 | 필수 |
| phone  | 문자열   | 예약자 핸드폰 번호 | 필수 |


#### **Response**

응답은 다음과 같은 JSON 형식입니다.

```json
{ 
  "flight_uuid " : "af6fa55c-da65-47dd-af23-578fdba40bed",
  "name" : "김코딩,
  "phone" : "010-1234-1234"
}
// 저장 완료 된 데이터
```
<center>[데이터] Request에 따른 Response 예시</center>

<br/>

### **예약 삭제**

클라이언트에서 특정 항공편 예약을 삭제할 때 사용하는 API입니다.

#### **Request**

```
 DELETE  /book?phone={phone}
```
<center>[요청] 특정 예약을 삭제하는 HTTP 요청</center>

<br/>

해당 요청은 파라미터(query parameter)를 사용해야합니다. 파라미터는 다음과 같이 사용합니다.

- `/book?phone=010-0000-0000`


<center>

| parameter | 형식    | 설명    | 필수 포함 여부 |
| --------- | ------ | ------ | ----------- |
| phone  | 예약자 핸드폰 번호 (문자열)   | phone 값이 포함된 예약 삭제 | 필수 |

\[표\] 파라미터 정보

</center>

<br/>

#### **Response**

응답은 다음과 같은 JSON 형식입니다.

```json
[
    {
       "flight_uuid": "af6fa55c-da65-47dd-af23-578fdba40bed",
       "name": "김코딩",
       "phone": "010-0000-0000", 
    }
   // 요청 데이터가 삭제 된 후 남은 모든 예약 데이터
]
```
<center>[데이터] Request에 따른 Response 예시</center>

