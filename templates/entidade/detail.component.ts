import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { I${entidade.singularNameUpper} } from './${entidade.singularNameLower}';
import { ${entidade.singularNameUpper}Service } from './${entidade.singularNameLower}.service';

@Component({
  templateUrl: './${entidade.singularNameLower}-detail.component.html',
  styleUrls: ['./${entidade.singularNameLower}-detail.component.css']
})
export class ${entidade.singularNameUpper}DetailComponent implements OnInit {
  pageTitle = '${entidade.singularNameUpper} Detail';
  errorMessage = '';
  ${entidade.singularNameLower}: I${entidade.singularNameUpper} | undefined;

constructor(private route: ActivatedRoute,
              private router: Router,
              private ${entidade.singularNameLower}Service: ${entidade.singularNameUpper}Service) {
  }

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    if (id) {
      this.get${entidade.singularNameUpper}(id);
    }
  }
  get${entidade.singularNameUpper}(id: number): void {
    this.${entidade.singularNameLower}Service.get${entidade.singularNameUpper}(id).subscribe({
      next: ${entidade.singularNameLower} => this.${entidade.singularNameLower} = ${entidade.singularNameLower},
      error: err => this.errorMessage = err
    });
  }

  onBack(): void {
    this.router.navigate(['/${entidade.pluralNameLower}']);
  }
}