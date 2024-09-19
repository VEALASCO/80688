const app = document.getElementById("app")
const url = "https://picsum.photos/id/"
const size = "/200/200"
const picture = parametro => {
    const src = url+parametro+size
    return 
    <figure>
        <img src="https://picsum.photos/id/${parametro}/200/200" alt="" id="${parametro}" class="">
        <figcaption>${parametro}</figcaption>
    </figure>
}
app.innerHTML = picture(1) + picture(2) + picture(3)

const lista = document.querySelectorAll("img")

for (let i=0; i < lista.length;i++){
    lista[i].addEventListener("mouseenter", (evento)=>{evento.target.classList.toggle("redonda")})

}