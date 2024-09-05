var wishbtn = document.querySelector(".wishbtn");
wishbtn.onclick = function(){
    alert("위시리스트에 추가했습니다.");
}
var cartbtn = document.querySelector(".cartbtn");
// btn.onclick = function(){
//     alert("장바구니에 추가했습니다.");
// }

cartbtn.addEventListener('click', function(){
	alert("장바구니에 추가했습니다.");
    location.href = "/cart"; // 장바구기 클릭시 장바구니 이동
});