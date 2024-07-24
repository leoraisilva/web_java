import Menu from "../input/Menu";
import Header from "../input/Header"
import '/src/components/page/admin.css'
import Painel from "../input/Painel";

function Admin({}){
    return(
        <>
            <header>
                <Header/>
            </header>
            <main>
                <Menu/>
                <Painel/>
            </main>
        </>
    )
}

export default Admin;