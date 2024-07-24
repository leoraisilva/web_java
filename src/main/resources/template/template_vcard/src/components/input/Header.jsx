import '/src/components/input/header.css'

function Cabecario({image, oncharge, text}){
    return(
        <div className='container-header'>
            <div className='cabecario-container'>
                <img src={image}/>
                <div className='cabecario-content'>
                    <div className='input-btn'>
                        <span class="material-symbols-outlined">search</span>
                        <input type='text' placeholder='Search..' oncharge={oncharge}/>
                    </div>
                </div>
                <div className='avatar-content'>
                    <div className='avatar-input'>
                        <span class="material-symbols-outlined notif">notifications</span>
                        <text>Hello {text}</text>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Cabecario;