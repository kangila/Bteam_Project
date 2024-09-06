// 0906 이순
var wishbtn = document.querySelector(".wishbtn");
wishbtn.onclick = function(){
    alert("위시리스트에 추가했습니다.");
}


var cartbtn = document.querySelector(".cartbtn");
cartbtn.addEventListener('click', function(){
	alert("장바구니에 추가했습니다.");
    //location.href = "/cart"; // 장바구기 클릭시 장바구니 이동
});


let minusbtn = document.querySelector(".minusbtn");


let plusbtn = document.querySelector(".plusbtn")



//
// --------- 긁어온거에유 ---------
//

function onCart(){
    var productId = $("#productId").val();
    var amount = document.getElementById('amount_input').value;
}


//물건 수량 감소
function count_down(productId){
    if($('#count_' + productId).text() == "0개") {
        alert("최소 갯수입니다.");
    }
}
    // else if($('#count_' + cartId).text() == "1개"){
    //     delete_cart(cartId);
    // }else{
//         $.ajax({
//             type: "post",
//             url: `/api/cart/${cartId}/down`,
//             contentType: "application/json; charset=utf-8",   //보낼 데이터의 형식
//             dataType: "json" //응답받을 데이터의 형식
//         }).done(res => {
//             //해당 cart찾기
//             var index = -1;
//             for(var i=0; i<res.data.length;i++){
//                 if(res.data[i].id == cartId){
//                     index = i;
//                 }
//             }

//             //수량 갱신
//             $('#count_' + cartId).text(res.data[index].product_count+"개");

//             //가격 갱신
//             $('#total_price_'+cartId).text(res.data[index].total_price+"원");

//             //장바구니 총 가격 갱신
//             var sum = 0;
//             for(var i=0; i<res.data.length; i++){
//                 sum += parseInt($('#total_price_'+res.data[i].id).text());
//             }
//             $('#summary').text(sum+"원");


//         }).fail(error => {
//             alert("수량 감소 실패");
//         });
//     }
// }

// //물건 수량 증가
// function count_up(cartId){
//     $.ajax({
//         type: "post",
//         url: `/api/cart/${cartId}/up`,
//         contentType: "application/json; charset=utf-8",   //보낼 데이터의 형식
//         dataType: "json" //응답받을 데이터의 형식
//     }).done(res => {
//         //해당 cart찾기
//         var index = -1;
//         for(var i=0; i<res.data.length;i++){
//             if(res.data[i].id == cartId){
//                 index = i;
//             }
//         }

//         //수량 갱신
//         $('#count_' + cartId).text(res.data[index].product_count+"개");

//         //가격 갱신
//         $('#total_price_'+cartId).text(res.data[index].total_price+"원");

//         //장바구니 총 가격 갱신
//         var sum = 0;
//         for(var i=0; i<res.data.length; i++){
//             sum += parseInt($('#total_price_'+res.data[i].id).text());
//         }
//         $('#summary').text(sum+"원");

//     }).fail(error => {
//         alert("수량 증가 실패");
//     });
// }









// // 수량 변경
// document.addEventListener('DOMContentLoaded', function(){
//   document.querySelectorAll('.updown').forEach(
//         function(item, idx){
//             //수량 입력 필드 값 변경
//             item.querySelector('input').addEventListener('keyup', function(){
//                 basket.changePNum(idx+1);
//             });
//             //수량 증가 화살표 클릭
//             item.children[1].addEventListener('click', function(){
//                 basket.changePNum(idx+1);
//             });
//             //수량 감소 화살표 클릭
//             item.children[2].addEventListener('click', function(){
//                 basket.changePNum(idx+1);
//             });
//         }
//     );
// });
    
    
    
// // 합계액 변경
// let basket = {
//     totalCount: 0, //전체 갯수 변수
//     totalPrice: 0, //전체 합계액 변수
    
//     reCalc: function(){
//         this.totalCount = 0;
//         this.totalPrice = 0;
//         document.querySelectorAll(".p_num").forEach(function (item) {
//             var count = parseInt(item.getAttribute('value'));9999
//             this.totalCount += count;
//             var price = item.parentElement.parentElement.previousElementSibling.firstElementChild.getAttribute('value');
//             this.totalPrice += count * price;
//         }, this); // forEach 2번째 파라메터로 객체를 넘겨서 this 가 객체리터럴을 가리키도록 함. - thisArg
//     },
//     //화면 업데이트
//     updateUI: function () {
//         document.querySelector('#sum_p_num').textContent = '상품갯수: ' + this.totalCount.formatNumber() + '개';
//         document.querySelector('#sum_p_price').textContent = '합계금액: ' + this.totalPrice.formatNumber() + '원';
//     },  
//  }
 
 
 

//  // 숫자 3자리 콤마찍기
// Number.prototype.formatNumber = function(){
//     if(this==0) return 0;
//     let regex = /(^[+-]?\d+)(\d)/;
//     let nstr = (this + '');
//     while (regex.test(nstr)) nstr = nstr.replace(regex, '$1' + ',' + '$2');
//     return nstr;
// };
      
    
    
    